package com.kh.practice.operator;

import java.util.Scanner;

public class Practice_Operator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 , num2;
		System.out.print("인원 수 : ");
		num1 = sc.nextInt();
		System.out.print("사탕 개수 : ");
		num2 = sc.nextInt();
		System.out.println("1인당 사탕 개수 : " + num2 / num1);
		System.out.println("남는 사탕 개수 : " + num2 % num1);
	}

}
