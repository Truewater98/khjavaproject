package com.kh.practice.condition;

import java.util.Scanner;

public class Practice_If1 {
	public static void main(String[] args) {
		/*
		 * A, B, C ����� ������ �Է� �ް� �� ����� ������ �μ�Ƽ�긦 ������ ������ ����Ͽ� ����ϰ� �μ�Ƽ�� ���� �޿��� 3000����
		 * �̻��̸� ��3000 �̻�, �̸��̸� ��3000 �̸����� ����ϼ���. (A ����� �μ�Ƽ��� 0.4, B ����� �μ�Ƽ��� ������, C
		 * ����� �μ�Ƽ��� 0.15)
		 * 
		 * ex. A����� ���� : 2500 B����� ���� : 2900 C����� ���� : 2600 A��� ����/����+a : 2500/3500.0
		 * 3000 �̻� B��� ����/����+a : 2900/2900.0 3000 �̸� C��� ����/����+a :
		 * 2600/2989.9999999999995 3000 �̸�
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("A����� ������ �Է����ּ��� : ");
		int salaryA = sc.nextInt();
		System.out.print("B����� ������ �Է����ּ��� : ");
		int salaryB = sc.nextInt();
		System.out.print("C����� ������ �Է����ּ��� : ");
		int salaryC = sc.nextInt();
		double salaryA_insen = salaryA + salaryA * 0.4;
		double salaryC_insen = salaryA + salaryA * 0.15;
		if (salaryA_insen >= 3000) {
			System.out.println("A��� ����/����+a : " + salaryA + "/" + salaryA_insen + " 3000 �̻�");
		} else if (salaryA_insen < 3000) {
			System.out.println("A��� ����/����+a : " + salaryA + "/" + salaryA_insen + " 3000 �̸�");
		}
		
		if (salaryB >= 3000) {
			System.out.println("A��� ����/����+a : " + salaryB + "/" + (double)salaryB + " 3000 �̻�");
		} else if (salaryB < 3000) {
			System.out.println("A��� ����/����+a : " + salaryB + "/" + (double)salaryB + " 3000 �̸�");
		}
		
		if (salaryC_insen >= 3000) {
			System.out.println("A��� ����/����+a : " + salaryC + "/" + salaryC_insen + " 3000 �̻�");
		} else if (salaryC_insen < 3000) {
			System.out.println("A��� ����/����+a : " + salaryC + "/" + salaryC_insen + " 3000 �̸�");
		}
	}
}
