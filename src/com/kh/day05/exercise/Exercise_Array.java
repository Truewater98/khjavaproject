package com.kh.day05.exercise;


import java.util.Scanner;

public class Exercise_Array {
	public void exercise1() {
		// ���̰� 100�� �迭�� �����ϰ� 1���� 100������ ����
		// ������� �־� �� ���� ����ϴ� �ڵ带 �ۼ��Ͻÿ�.
		int[] array = new int[100];
		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public void exercise2() {
		// ���̰� 5�� String �迭�� �����ϰ�
		// "����", "������", "Ű��", "���", "�ٳ���"��
		// �ʱ�ȭ �� �� , for���� Ȱ���ؼ� �ٳ����� ������ �ٳ����� ����غ�����!
		String[] array = new String[5];
		array[0] = "����";
		array[1] = "������";
		array[2] = "Ű��";
		array[3] = "���";
		array[4] = "�ٳ���";
		// ���� �� ���ϰ�! -> �Ҵ�� �ʱ�ȭ ���ÿ�!!
		String[] fruit = { "����", "������", "Ű��", "���", "�ٳ���" };
		for (int i = 0; i < array.length; i++) {
			if (array[i] == "�ٳ���") {
				System.out.println("�ٳ���");
			}
		}
	}

	public void exercise3() {
		// ���� ���� 5���� �Է¹޾� �迭�� �����ϰ�
		// �Է¹��� ������ ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�
		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];
		int sum = 0;
		System.out.print("���� ���� 5���� �Է����ּ��� : ");
		for (int i = 0; i < 5; i++) {
			array[i] = sc.nextInt();
			sum += array[i];
		}
		System.out.println("�Է¹��� ������ ����� : " + (double) sum / array.length);

	}

	public void exercise4() {
		// ���� ���� 5���� �Է¹޾� �迭�� �����ϰ�
		// ���� ū ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� 5���� �Է����ּ��� : ");
		int[] array = new int[5];
		int max = 0;
		for (int i = 0; i < 5; i++) {
			array[i] = sc.nextInt();
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println(max);
	}

	public void exercise5() {
		// ����ڿ��� �ֹι�ȣ�� �Է� ���� ��
		// ���� �ڸ� ���ĺ��� *�� ����Ǿ� ��µǵ��� ���α׷��� �ۼ��Ͻÿ�
		// 210618-1124600 -> 210618-1******
		// 200518-3233920 -> 200518-3******
		Scanner sc = new Scanner(System.in);
		char[] origin = new char[14];
		System.out.print("�ֹε�Ϲ�ȣ �Է�(-����) : ");
		String memberNum = sc.next();
		// String���� �Է¹��� ���� �ϳ��� �߶� origin ���ڹ迭�� �ֱ�!
		for (int i = 0; i < origin.length; i++) {
			origin[i] = memberNum.charAt(i);
		}
		// char[] copy = origin; // ���� ����, �̷��� �ǵ��� ���� �ƴϴ�!
		char[] copy = new char[14]; // ���� ������ ����!
		for (int i = 0; i < origin.length; i++) {
			if (i < 8) {
				copy[i] = origin[i];
			}
			else {			
				copy[i] = '*';
			}
			System.out.print(copy[i]);
		}
		System.out.println();
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i]);
		}
	}
}

