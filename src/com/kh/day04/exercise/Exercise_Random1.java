package com.kh.day04.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Random1 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("===== ���� �� �� ���߱� =====(����� -1 �Է�)");
			System.out.print("���ڸ� �Է����ּ���(1.�ո� / 2.�޸�) : ");
			int choice = sc.nextInt();
			if(choice == -1) break;
			// computer �������� 1 �Ǵ� 2�� ���� �����ϰ� ������.
			int computer = rand.nextInt(2) + 1;
			if(choice != 1 && choice != 2) {
				System.out.println("2�Ǵ� 1�� �Է����ּ���.");
			}
			else if (computer == choice)
				System.out.println("������ϴ�.");
			else
				System.out.println("Ʋ�Ƚ��ϴ�.");
		}
	}
}
