package com.kh.day05.array;

public class Exam_SortBubble {
	public static void main(String[] args) {
		// 정렬 알고리즘
		// 1. 삽입정렬
		// 2. 선택정렬
		// 3. 버블정렬
		// 버블정렬이란?
		// 인접한 두개의 원소를 검사하여 정렬하는 방법
		// 구현이 쉽다는 장점이 있고, 이미 정렬된 데이터를 정렬할 때 가장 빠름.
		// 기본적으로 다른 정렬에 비해 정렬 속도가 느리며, 역순으로 정렬할 때
		// 가장 느림.
		// {2, 5, 4, 1, 3}
		// i = 0일 때
		// 2, 5, 4, 1, 3
		// 2, 4, 5, 1, 3
		// 2, 4, 1, 5, 3
		// 2, 4, 1, 3, 5
		// i = 1일때
		// 2, 4, 1, 3, 5
		// 2, 1, 4, 3, 5
		// 2, 1, 3, 4, 5
		// i = 2일떄
		// 1, 2, 3, 4, 5
		// 1, 2, 3, 4, 5
		int[] array = { 2, 5, 4, 1, 3 };
		for (int i = 0; i < array.length - 1; i++) {
//           for(int j = 0; j < array.length-1-i; j++) {
//        	   if(array[j] > array[j+1]) {
//        		   int temp = array[j+1];
//        		   array[j+1] = array[j];
//        		   array[j] = temp;
//        	   }
//           } //43210 => 5 - 1 -(01234) j = 43210 
		}
		for(int i = 0; i < 5; i++) {
		System.out.print(array[i]);
		}
	}

}
