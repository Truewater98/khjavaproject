package com.kh.practice.complex;

import java.util.Scanner;

public class Practice_Complex4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor, math, eng, sum;
		double everage;
		System.out.print("���� ������ �Է��ϼ���. : ");
		kor = sc.nextInt();
		System.out.print("���� ������ �Է��ϼ���. : ");
		eng = sc.nextInt();
		System.out.print("���� ������ �Է��ϼ���. : ");
		math = sc.nextInt();
		
		sum = kor + eng + math;
		everage = (double)sum / 3.0;
		System.out.println("�հ�� : " + sum);
		System.out.println("����� : " + everage);
		if(kor >= 40 && eng >= 40 && math >= 40 && everage >= 60) {
			System.out.print("�հ�");
		}
		else {
			System.out.print("���հ�");
		}
		
	}

}
