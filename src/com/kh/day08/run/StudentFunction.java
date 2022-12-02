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
		System.out.println("====== 학생 성적 확인 프로그램 =====");
		System.out.println("1. 학생 성적 입력");
		System.out.println("2. 학생 성적 출력");
		System.out.println("3. 재평가 여부 확인");
		System.out.println("4. 프로그램 종료");
		System.out.print("메뉴 입력 : ");
		int menu = sc.nextInt();
		return menu;
	}
	
	public void inputScore() {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < students.length; i++) {
			System.out.println("======"+ (i + 1) +" 번째 학생 정보 입력 ======");
			System.out.print("학생 이름 입력 : ");
			String name = sc.next();
			System.out.print("1차 점수 입력 : ");
			int firstScore = sc.nextInt();
			System.out.print("2차 점수 입력 : ");
			int secondScore = sc.nextInt();
			students[i] = new Student();
			students[i].setName(name);
			students[i].setFirstScore(firstScore);
			students[i].setSecondScore(secondScore);			
		}
	}
	
	public void printScore() {
		for(int i = 0; i < students.length; i++) {
			System.out.println("======" + (i+1) + "번째 학생 정보 출력");
			System.out.println(students[i].getName() + "학생의 점수는");
			System.out.println("1차 점수 : "+ students[i].getFirstScore() + ", 2차 점수 : " +students[i].getSecondScore() + "입니다.");
		}
	}
	
	public void checkPass() {
		/*
		 * 0. 재평가의 여부는 1차, 2차가 각각 다르다.
		 * 1. 점수가 40점 미만의 경우 과락으로 재평가 대상자가 된다.
		 * 2. 1차 점수와 2차 점수의 평균은 60점을 넘어야 한다.
		 * 3. 1차 점수와 2차 점수의 평균은 60점 미만의 경우 60점 미만의 과목에 대해서 재평가를 본다.
		 * 
		 */
		for(int i = 0; i < students.length; i++) {
			System.out.println(students[i].getName() + "학생은");
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
					System.out.println("1차 시험 재평가");
				}
				if(second){
					System.out.println("2차 시험 재평가");
				}
			}
			else {
				System.out.println("통과입니다.");
			}
		}
		
	}
	
	public void printGoobye() {}
	
	public void printException() {}

}
