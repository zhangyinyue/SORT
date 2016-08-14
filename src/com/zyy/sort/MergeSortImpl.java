package com.zyy.sort;
/**
 * 实现归并排序
 * @author  zyy E-mail: 1016317391@qq.com
 * @date 创建时间：2016年8月13日 下午3:54:57
 * @version 1.0 
 * 
 */
public class MergeSortImpl {

	/**
	 * 合并排序
	 * @param source
	 * @param first
	 * @param mid
	 * @param last
	 * @param sourceSort
	 */
	private void merge(int[]source, int first, int mid, int last, int[] sourceSort){
		
		int i = first, j = mid+1, k = 0;
		while(i <= mid && j <= last){
			if(source[i] < source[j]){
				sourceSort[k++] = source[i++];
			}else{
				sourceSort[k++] = source[j++];
			}
		}
		
		while(i <= mid){
			sourceSort[k++] = source[i++];
		}
		while(j <= last){
			sourceSort[k++] = source[j++];
		}
		
		for(int l = 0; l < k; l++){
			source[l+first] = sourceSort[l];
		}
	}
	
	/**
	 * 划分
	 * @param source
	 * @param first
	 * @param last
	 * @param sourceSort
	 */
	private void mergeSpil(int[] source, int first,  int last, int[] sourceSort){
		
		int mid = (first + last)/ 2;
		if(first >= last){
			return;
		}
		 mergeSpil(source, first, mid, sourceSort);
		 mergeSpil(source, mid+1, last, sourceSort);
		 merge(source, first, mid, last, sourceSort);
		
	}
	/**
	 * 传入一个整型数组
	 * @param source
	 * @return
	 */
	public int[] sort(int[] source){
		mergeSpil(source, 0, source.length - 1, new int[source.length]);
		return source;
	}
}
