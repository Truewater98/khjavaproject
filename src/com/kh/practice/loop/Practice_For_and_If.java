package com.kh.practice.loop;

import java.util.Scanner;

public class Practice_For_and_If {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����ϰ� ���� �ܼ� �Է� : ");
		int num = sc.nextInt();
        if(num <= 9) {
        	for(int i = 1; i <= 9; i++) {
        		if(i >= num) {
        		System.out.println("=====" + i +"�� =====");
        		for(int j = 1; j <= 9; j++) {
        			System.out.println(i + " * " + j + " = " + i*j);
        		}
        	    }
        	}
        }
        else {
        	System.out.println("9 ������ ���ڸ� �Է����ּ���.");
        }
	}

}
