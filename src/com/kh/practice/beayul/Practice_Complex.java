package com.kh.practice.beayul;

import java.util.Arrays;
import java.util.Scanner;

public class Practice_Complex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�迭�� ũ�⸦ �Է��ϼ��� : ");
		int num = sc.nextInt();
		int size = 1;
		sc.nextLine();
		String[] array = new String[num];
		for (int i = 0; i < num; i++) {
			System.out.print(size + "��° ���ڿ� : ");
			array[i] = sc.nextLine();
			size++;
		}
		while (true) {
			System.out.print("�� ���� �Է��Ͻðڽ��ϱ�?(Y/N) : ");
			char TF = sc.next().charAt(0);
			if (TF == 'Y' || TF == 'y') {
				System.out.print("�� �Է��ϰ� ���� ����? : ");
				num = sc.nextInt();
				sc.nextLine();
				array = Arrays.copyOf(array, array.length + num);
				for (int i = 0; i < num; i++) {
					System.out.print(size + "��° ���ڿ� : ");
					array[size - 1] = sc.nextLine();
					size++;
				}

			} else if (TF == 'N' || TF == 'n') {
				break;
			}
		}
		    System.out.print("[" + array[0]);
		for (int i = 1; i < size - 1; i++) {
			System.out.print(", " + array[i]);
		}
	        System.out.println("]");
	}
}
