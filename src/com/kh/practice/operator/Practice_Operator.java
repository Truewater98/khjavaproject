package com.kh.practice.operator;

import java.util.Scanner;

public class Practice_Operator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 , num2;
		System.out.print("�ο� �� : ");
		num1 = sc.nextInt();
		System.out.print("���� ���� : ");
		num2 = sc.nextInt();
		System.out.println("1�δ� ���� ���� : " + num2 / num1);
		System.out.println("���� ���� ���� : " + num2 % num1);
	}

}
