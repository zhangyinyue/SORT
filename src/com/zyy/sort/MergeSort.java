package com.zyy.sort;
/**
 * 归并排序实现
 * @author  zyy E-mail: 1016317391@qq.com
 * @date 创建时间：2016年8月13日 下午3:54:57
 * @version 1.0 
 * 
 */
public class MergeSort {

	private int[] source;
	
	/**
	 * 合并比较
	 * @param source
	 * @param first
	 * @param last
	 * @param sourceSort
	 */
	private void merge (int[] source, int first,int mid, int last, int[] sourceSort){
		
		int i = first, j = mid+1, k = 0;
		while(i <= mid && j <= last){
			if(source[i] < source[j]){
				sourceSort[k++] = source[i];
				i++;
			}else{
				sourceSort[k++] = source[j];
				j++;
			}
		}
		while( i <= mid){
			sourceSort[k++] = source[i++];
		}
		while(j <= last){
			sourceSort[k++] = source[j++];
		}
		
		for(int l = 0; l < k; l++){
			source[first+l] = sourceSort[l];
		}
	}
	
	/**
	 * 递归分组
	 * @param source
	 * @param first
	 * @param last
	 * @param sourceSort
	 */
	public void mergeSpil(int[] source, int first, int last, int[] sourceSort){
		int mid = (first + last) / 2;
		if(first >= last){
			return ;
		}
		mergeSpil(source, first, mid, sourceSort);
		mergeSpil(source, mid+1, last, sourceSort);
		merge(source, first,mid, last, sourceSort);
	}
	
}
