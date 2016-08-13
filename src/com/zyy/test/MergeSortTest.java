package com.zyy.test;

import com.zyy.sort.MergeSort;

/**
 * 归并排序测试类
 * @author  zyy E-mail: 1016317391@qq.com
 * @date 创建时间：2016年8月13日 下午3:54:57
 * @version 1.0 
 * 
 */
public class MergeSortTest {

	public static void main(String[] args) {
		//System.out.println("zhangyinyueshidatiancai");
		MergeSort mergeSort = new MergeSort();
		int[] source = new int[] {4,3,8,6,1,9,0,5,2};
		int[] sourceSort = new int[source.length];
		mergeSort.mergeSpil(source, 0, source.length-1, sourceSort);
		for(int i = 0 ; i < source.length; i++){
			System.out.print(source[i]+" ");
		}
		
	}
	
}
