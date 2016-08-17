package com.zyy.sort.test;
/**
 * 第三次实现归并排序
 * @author  zyy E-mail: 1016317391@qq.com
 * @date 创建时间：2016年8月13日 下午3:54:57
 * @version 3.0 
 * 
 */
public class MergeSort {

	/**
	 * 合并操作
	 * @param source 源数组
	 * @param first 开始位置
	 * @param mid 中间位置
	 * @param last 最后位置
	 * @param sourceSort 临时有序的数组
	 */
	private void merge(int[] source, int first, int mid, int last, int[] sourceSort){
		
		int i = first, j = mid +1, k = 0; 
		//从同一起点开始比较，把有序的放入到sourceSort中
		while(i <= mid && j <= last){
			if(source[i] >= source[j]){
				sourceSort[k++] = source[i++];
			}else{
				sourceSort[k++] = source[j++];
			}
		}
		//如果first到mid前半段有还没放到sourceSort中，就放入
		while(i <= mid){
			sourceSort[k++] = source[i++];
		}
		//如果后半段有还没放入sourceSort中的，就放入
		while(j <= last){
			sourceSort[k++] = source[j++];
		}
		//把sourceSort中有序的替换到source中
		for(int l = 0; l < k; l++){
			source[first+l] = sourceSort[l];
		}
	}
	/**
	 * 递归分解
	 */
	private void mergeSpil(int[] source, int first, int last){
		//递归临界值
		if(first >= last) return ;
		//对半分治
		int mid = (first + last) / 2;
		//前半部分进行处理
		mergeSpil(source, first, mid);
		//后半部分进行处理
		mergeSpil(source, mid + 1, last);
		//对最后面的一次进行整合
		merge(source, first, mid, last, new int [source.length]);
	}
	
	/**
	 * 排序入口
	 * @param source 源数组
	 * @return
	 */
	public int[] sort(int[] source){
		mergeSpil(source, 0, source.length - 1);
		return source;
	}
	
	public static void main(String[] args) {
		MergeSort mergeSort = new MergeSort();
		int[] source = mergeSort.sort(new int[]{3,2,6,1,7,4,5,9,8,11});
		for(int i = 0; i < source.length; i++){
			System.out.print(source[i]+" ");
		}
	}
}
