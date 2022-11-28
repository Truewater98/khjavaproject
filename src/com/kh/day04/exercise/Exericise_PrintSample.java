package com.kh.day04.exercise;

public class Exericise_PrintSample {
	public static void main(String[] args) {
		// System.out.println에서 정수 + 문자열 -> 문자열
		System.out.println(1 + "1");
		// 문자 + 문자 -> 문자
		System.out.println('1' + '1');
		// 정수 + 정수 + 문자열 + 정수 -> 최종적으로는 문자열
		System.out.println(10 + 20 + "Hello" + 10);
		
		//printf에 대하여 알아보자
		//println, print -> 줄바꿈의 차이
		System.out.print("정수 입력 : "); // 바로 옆에 입력받음.
		System.out.println("정수 입력 : ");  // 줄바꾸고 입력받음.
		System.out.printf("정수 출력 : %d \n", 1);
		System.out.printf("문자열 출력 : %s", "Hello World");
	}
}
