package com.kh.day03.exercise;

import java.util.Scanner;

public class Exercise_Calculator {
	public static void main(String[] args) {
		// 두 개의 정수를 입력받고 연산자를 입력받아서
		// 계산하는 계산기 프로그램을 작성하세요!!
		// 정수를 입력해주세요 : 11
		// 정수를 한번 더 입력해주세요 : 22
		// 연산자를 입력해주세요(+,-,*,/,%) : %
		// 결과 : 11 % 22 = 11 = 11
		
		//1 정수하나 입력받음
		//2 정수하나 입력받음
		//3 연산자 입력받음
		//4 연산자 판별 후 연산 수행 후 결과저장
		//5 결과출력
        Scanner sc = new Scanner(System.in);
        int result = 0;
        double divonly = 0.0;
        System.out.print("정수를 입력해주세요 : ");
        int num1 = sc.nextInt();
        System.out.print("정수를 한번 더 입력해주세요 : ");
        int num2 = sc.nextInt();
        System.out.print("연산자를 입력해주세요(+,-,*,/,%) : ");
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
        	   System.out.println("결과 : " + num1 + " " + operator + " " + num2 + " = " + divonly );
        }
        else {
        	System.out.println("결과 : " + num1 + " " + operator + " " + num2 + " = " + result );
        }
	}

}
