package com.zyy.test;

import com.zyy.sort.QuickSort;

/**
 * 
 * @author  zyy E-mail: 1016317391@qq.com
 * @date 创建时间：2016年8月13日 下午3:54:57
 * @version 1.0 
 * 
 */
public class QuickSortTest {

	public static void main(String[] args) {
		QuickSort quickSort = new QuickSort();
		int[] source = new int[] {7,2,4,6,1,5};
		quickSort.sort(source);
		for(int i = 0 ; i < source.length; i++){
			System.out.print(source[i]+" ");
		}
		
	}
}
