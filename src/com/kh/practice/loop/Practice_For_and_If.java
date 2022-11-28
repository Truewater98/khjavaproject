package com.kh.practice.loop;

import java.util.Scanner;

public class Practice_For_and_If {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("출력하고 싶은 단수 입력 : ");
		int num = sc.nextInt();
        if(num <= 9) {
        	for(int i = 1; i <= 9; i++) {
        		if(i >= num) {
        		System.out.println("=====" + i +"단 =====");
        		for(int j = 1; j <= 9; j++) {
        			System.out.println(i + " * " + j + " = " + i*j);
        		}
        	    }
        	}
        }
        else {
        	System.out.println("9 이하의 숫자만 입력해주세요.");
        }
	}

}
