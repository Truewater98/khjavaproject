package com.kh.day05.exercise;

import java.util.Scanner;

public class Exercise_While {
	public void exercise1() {
		int i = 1;
		int sum = 0;
		while (i < 101) {
			sum += i;
			i += 2;
		}
		System.out.println(sum);

	}

	public void exercise2() {

		// ������ �ϳ� �Է¹޾Ƽ� �� ���� 1 ~ 9 ������ ���� ����
		// �� ���� �������� ����ϼ���.
		// ��, ������ ���� ������ "1 ~ 9������ ����� �Է��Ͽ��� �մϴ�"�� ����ϼ���.
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ��� �Է��ϼ���. : ");
		int i = sc.nextInt();
		int num = 1;
		while (num < 10) {
			System.out.println(i + " * " + num + " = " + i * num);
			num++;
		}
	}

	public void exercise3() {

		// while���� �̿��Ͽ� -1�� �Էµ� ������ ������ �Է¹ް� -1�� �ԷµǸ� �Է��� ���� ���� ����Ͻÿ�
		// ���� �ϳ� �Է� : 3
		// ���� �ϳ� �Է� : 4
		// ���� �ϳ� �Է� : 7
		// ���� �ϳ� �Է� : -1
		// �Է��Ͻ� ���� ���� : 14
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int sum = 1;
		while (num != -1) {
			System.out.print("���� �ϳ� �Է� : ");
			num = sc.nextInt();
			sum += num;
		}
		System.out.println("�Է��Ͻ� ���� ���� : " + sum);
	}
}
