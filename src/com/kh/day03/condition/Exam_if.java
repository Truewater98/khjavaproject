package com.kh.day03.condition;

import java.util.Scanner;

public class Exam_if {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int input = sc.nextInt();
		String result;
		if(input % 2 == 0) {
			result = "짝수";
			
		} else {
			result = "홀수";
		}
		
		System.out.println(input + "은/는 " + result + "입니다.");
		
	}

}
