package com.kh.day03.exercise;

import java.util.Scanner;

public class Exercise_if {
	public static void main(String[] args) {
		// indent ���� : ctrl + shift + f 
		// ���� �ϳ��� �Է¹޾Ƽ� ���� ��������, 0����, ���� ��������
		// �Ǻ��ϴ� ���α׷��� �ۼ��Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ��� �Է����ּ���. :");
		int input = sc.nextInt();
		String result = "";
		if(input > 0) 
			result = "���� ����";
		else if(input < 0) 
			result = "���� ����";
		else 
			result = "0";
		System.out.println("�Է��Ͻ� ������ " + result +"�Դϴ�.");				
	}

}
