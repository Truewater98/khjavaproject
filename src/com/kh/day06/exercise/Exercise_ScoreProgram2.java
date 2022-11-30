package com.kh.day06.exercise;

import java.util.Scanner;

public class Exercise_ScoreProgram2 {
	static int kor = 0;
	static int eng = 0;
	static int math = 0; //��������, Ŭ���� ����
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ESCAPE:
		while(true) {
			printMenu();
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1 : 
				inputScore();
				break;
			case 2 : 
				printScore();
				break;
			case 3 : 
				goodbyeMsg();
				break ESCAPE;
			default : 
				printException();
			}
		}
		
	}
	static public void printMenu() {
		System.out.println("====== ���� �޴� ======");
		System.out.println("1. �����Է�");
		System.out.println("2. �������");
		System.out.println("3. ����");
		System.out.print("���� : ");

	}
	static public void inputScore() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== ���� �Է� ======");
		System.out.print("���� : ");
		kor = sc.nextInt();
		System.out.print("���� : ");
		eng = sc.nextInt();
		System.out.print("���� : ");
		math = sc.nextInt();
	}
	static public void printScore() {
		int sum = kor + eng + math;
		double avg = (double)sum / 3;
		System.out.println("====== ���� ��� ======");
	    System.out.println("���� : " + kor);
	    System.out.println("���� : " + eng);
	    System.out.println("���� : " + math);
	    System.out.println("���� : " + sum);
	    System.out.printf("��� : %.2f \n", avg);
	}
	static public void goodbyeMsg() {
		System.out.println("Good bye~");
	}
	static public void printException() {
		System.out.println("1 ~ 3 ������ ���� �Է����ּ���~");
	}
}
