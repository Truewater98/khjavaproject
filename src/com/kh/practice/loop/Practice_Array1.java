package com.kh.practice.loop;

import java.util.Scanner;

public class Practice_Array1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.print("���� �ϳ��� �Է��ϼ��� : " );
		num = sc.nextInt();
		boolean sosu = true;
		while(num < 2) {
			System.out.println("���� : " + num);
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			System.out.print("���� �ϳ��� �Է��ϼ��� : " );
			num = sc.nextInt();
			
		}
		for(int i = 2; i < num; i++) {
			int TF = num % i;
			if(TF == 0) {
			   sosu = false;
			   break;
			}
		}
		System.out.println("���� : " + num);
		if(sosu) {
			System.out.println("�Ҽ��Դϴ�.");
		}
		else {
			System.out.println("�Ҽ��� �ƴմϴ�.");
		}
	}

}
