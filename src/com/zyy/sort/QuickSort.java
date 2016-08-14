package com.zyy.sort;
/**
 * 快速排序
 * @author  zyy E-mail: 1016317391@qq.com
 * @date 创建时间：2016年8月13日 下午3:54:57
 * @version 1.0 
 * 
 */
public class QuickSort {

	public int[] sort(int[] source){
		
		quick(source, 0, source.length-1);
		return source;
	}
	
	private void quick(int[] source,int low, int high){
		if(low >= high)return;
		int i = quickSpil(source, low,high);
		quick(source, low, i-1);
		quick(source, i+1, high);
	}
	
	//7,2,4,6,1,5
	private int quickSpil(int[] source, int low, int high){
		int begin = source[low];
		while(low < high){
		
			while(low < high){
				if(source[high] <= begin){
					source[low++] = source[high];
					break;
				}
				high--;
				
			}
			while(low < high){
				if(source[low] > begin){
					source[high--] = source[low];
					break;
				}
				low++;
			}
			
			
		}
		source[low] = begin;
		
		 return low;
	}
}
