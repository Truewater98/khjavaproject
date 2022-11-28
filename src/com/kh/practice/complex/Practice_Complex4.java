package com.kh.practice.complex;

import java.util.Scanner;

public class Practice_Complex4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor, math, eng, sum;
		double everage;
		System.out.print("국어 점수를 입력하세요. : ");
		kor = sc.nextInt();
		System.out.print("영어 점수를 입력하세요. : ");
		eng = sc.nextInt();
		System.out.print("수학 점수를 입력하세요. : ");
		math = sc.nextInt();
		
		sum = kor + eng + math;
		everage = (double)sum / 3.0;
		System.out.println("합계는 : " + sum);
		System.out.println("평균은 : " + everage);
		if(kor >= 40 && eng >= 40 && math >= 40 && everage >= 60) {
			System.out.print("합격");
		}
		else {
			System.out.print("불합격");
		}
		
	}

}
