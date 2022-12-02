package com.kh.day08.run;

import java.util.Scanner;

import com.kh.day08.student.Student;

public class StudentFunction {
	Student[] students;
	
	public StudentFunction() {
		students = new Student[3];
	}
	
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== �л� ���� Ȯ�� ���α׷� =====");
		System.out.println("1. �л� ���� �Է�");
		System.out.println("2. �л� ���� ���");
		System.out.println("3. ���� ���� Ȯ��");
		System.out.println("4. ���α׷� ����");
		System.out.print("�޴� �Է� : ");
		int menu = sc.nextInt();
		return menu;
	}
	
	public void inputScore() {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < students.length; i++) {
			System.out.println("======"+ (i + 1) +" ��° �л� ���� �Է� ======");
			System.out.print("�л� �̸� �Է� : ");
			String name = sc.next();
			System.out.print("1�� ���� �Է� : ");
			int firstScore = sc.nextInt();
			System.out.print("2�� ���� �Է� : ");
			int secondScore = sc.nextInt();
			students[i] = new Student();
			students[i].setName(name);
			students[i].setFirstScore(firstScore);
			students[i].setSecondScore(secondScore);			
		}
	}
	
	public void printScore() {
		for(int i = 0; i < students.length; i++) {
			System.out.println("======" + (i+1) + "��° �л� ���� ���");
			System.out.println(students[i].getName() + "�л��� ������");
			System.out.println("1�� ���� : "+ students[i].getFirstScore() + ", 2�� ���� : " +students[i].getSecondScore() + "�Դϴ�.");
		}
	}
	
	public void checkPass() {
		/*
		 * 0. ������ ���δ� 1��, 2���� ���� �ٸ���.
		 * 1. ������ 40�� �̸��� ��� �������� ���� ����ڰ� �ȴ�.
		 * 2. 1�� ������ 2�� ������ ����� 60���� �Ѿ�� �Ѵ�.
		 * 3. 1�� ������ 2�� ������ ����� 60�� �̸��� ��� 60�� �̸��� ���� ���ؼ� ���򰡸� ����.
		 * 
		 */
		for(int i = 0; i < students.length; i++) {
			System.out.println(students[i].getName() + "�л���");
			boolean first = false;
			boolean second = false;
			if((students[i].getFirstScore() + students[i].getSecondScore()) / 2 >= 60) { 
				
				if(students[i].getFirstScore() < 40) {
					first = true;
				}
				if(students[i].getSecondScore() < 40) {
					second = true;
				}			
			}
			else {
				if(students[i].getFirstScore() < 60) {
					first = true;
				}
				if(students[i].getSecondScore() < 60) {
					second = true;
				}
			}
			if(first || second) {
				if(first) {
					System.out.println("1�� ���� ����");
				}
				if(second){
					System.out.println("2�� ���� ����");
				}
			}
			else {
				System.out.println("����Դϴ�.");
			}
		}
		
	}
	
	public void printGoobye() {}
	
	public void printException() {}

}
