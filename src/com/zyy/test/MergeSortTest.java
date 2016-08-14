package com.zyy.test;

import com.zyy.sort.MergeSort;
import com.zyy.sort.MergeSortImpl;

/**
 * 归并排序测试类
 * @author  zyy E-mail: 1016317391@qq.com
 * @date 创建时间：2016年8月13日 下午3:54:57
 * @version 1.0 
 * 
 */
public class MergeSortTest {

	public static void main(String[] args) {
		MergeSortImpl mergesort = new MergeSortImpl();
		int[] source = new int[] {4,3,4,8,6,1,9,0,5,2};
		mergesort.sort(source);
		for(int i = 0 ; i < source.length; i++){
			System.out.print(source[i]+" ");
		}
		
	}
	
}
