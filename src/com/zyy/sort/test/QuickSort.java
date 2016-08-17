package com.zyy.sort.test;
/**
 * 快速排序
 * @author  zyy E-mail: 1016317391@qq.com
 * @date 创建时间：2016年8月13日 下午3:54:57
 * @version 2.0 
 * 
 */
public class QuickSort {

	/**
	 * 确定最前位置的数的排序位置,并返回这个位置
	 * @param source
	 * @param low
	 * @param hieh
	 * @return
	 */
	private int quick(int[] source, int low, int high){
		int begin = source[low];
		
		while(low < high){
			//从后往前找，找到第一个小于begin的数，坑好第一个坑
			while(low < high){
				if(source[high] > begin){
					source[low] = source[high];
					break;
				}
				high--;
			}
			//从前往后找，找到第一个大于begin的数，放到最后一个坑
			while(low < high){
				if(source[low] <= begin){
					source[high] = source[low];
					break;
				}
				low++;
			}
		}
		//最开始的数放到中间;
		source[low] = begin;
		return low;
	}
	/**
	 * 快速排序分区而治
	 * @param source
	 * @param low
	 * @param high
	 */
	private void quickSpil(int[] source, int low, int high){
		//递归临界值
		if(low >= high)return;
		int i = quick(source, low, high);
		quickSpil(source, low, i);
		quickSpil(source, i+1, high);
	}
	
	/**
	 * 快速排序入口
	 * @param source 源数组
	 * @return
	 */
	public int[] sort(int[] source){
		
		quickSpil(source, 0, source.length-1);
		return source;
	}
	
	//test
	public static void main(String[] args) {
		QuickSort quickSort = new QuickSort();
		int[] source = quickSort.sort(new int[]{3,2,6,1,7,4,5,9,8,11});
		for(int i = 0; i < source.length; i++ ){
			System.out.print(source[i]+" ");
		}
	}
}
