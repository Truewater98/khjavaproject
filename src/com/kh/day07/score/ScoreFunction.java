package com.kh.day07.score;

import java.util.Scanner;

public class ScoreFunction {
    private int kor;
    private int eng;
    private int math;
    
    ScoreFunction(){
    	kor = 0;
    	eng = 0;
    	math = 0;
    }
    
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 메인 메뉴 ======");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.print("선택 : ");
		int choice =  sc.nextInt();
	    return choice;
	}
	
	public void inputScore() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 성적 입력 ======");
		System.out.print("국어 : ");
		kor = sc.nextInt();
		System.out.print("영어 : ");
		eng = sc.nextInt();
		System.out.print("수학 : ");
		math = sc.nextInt();
	}
	
	public void printScore() {
		int sum = kor + eng + math;
		double avg = (double)sum / 3;
		System.out.println("====== 성적 출력 ======");
	    System.out.println("국어 : " + kor);
	    System.out.println("영어 : " + eng);
	    System.out.println("수학 : " + math);
	    System.out.println("총점 : " + sum);
	    System.out.printf("평균 : %.2f \n", avg);
	}

	public void goodbyeMsg() {
		System.out.println("Good bye~");
	}
	
	public void exceptionMsg() {
		System.out.println("1 ~ 3 사이의 수를 입력해주세요~");
	}

}
