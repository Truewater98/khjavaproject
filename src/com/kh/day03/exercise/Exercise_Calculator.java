package com.kh.day03.exercise;

import java.util.Scanner;

public class Exercise_Calculator {
	public static void main(String[] args) {
		// �� ���� ������ �Է¹ް� �����ڸ� �Է¹޾Ƽ�
		// ����ϴ� ���� ���α׷��� �ۼ��ϼ���!!
		// ������ �Է����ּ��� : 11
		// ������ �ѹ� �� �Է����ּ��� : 22
		// �����ڸ� �Է����ּ���(+,-,*,/,%) : %
		// ��� : 11 % 22 = 11 = 11
		
		//1 �����ϳ� �Է¹���
		//2 �����ϳ� �Է¹���
		//3 ������ �Է¹���
		//4 ������ �Ǻ� �� ���� ���� �� �������
		//5 ������
        Scanner sc = new Scanner(System.in);
        int result = 0;
        double divonly = 0.0;
        System.out.print("������ �Է����ּ��� : ");
        int num1 = sc.nextInt();
        System.out.print("������ �ѹ� �� �Է����ּ��� : ");
        int num2 = sc.nextInt();
        System.out.print("�����ڸ� �Է����ּ���(+,-,*,/,%) : ");
        char operator = sc.next().charAt(0);
        if(operator == '+') {
            result = num1 + num2; 
        }
        else if(operator == '-') {
            result = num1 - num2;
        }
        else if(operator == '*') {
        	result = num1 * num2;
        	}
        else if(operator == '/') {
        	divonly = num1 / (double)num2;
        }
        else {
        	result = num1 % num2;
        	}
        
        
        if(operator == '/') {
        	   System.out.println("��� : " + num1 + " " + operator + " " + num2 + " = " + divonly );
        }
        else {
        	System.out.println("��� : " + num1 + " " + operator + " " + num2 + " = " + result );
        }
	}

}
