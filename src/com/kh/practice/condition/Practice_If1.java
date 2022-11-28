package com.kh.practice.condition;

import java.util.Scanner;

public class Practice_If1 {
	public static void main(String[] args) {
		/*
		 * A, B, C 사원의 연봉을 입력 받고 각 사원의 연봉과 인센티브를 포함한 연봉을 계산하여 출력하고 인센티브 포함 급여가 3000만원
		 * 이상이면 “3000 이상”, 미만이면 “3000 미만”을 출력하세요. (A 사원의 인센티브는 0.4, B 사원의 인센티브는 없으며, C
		 * 사원의 인센티브는 0.15)
		 * 
		 * ex. A사원의 연봉 : 2500 B사원의 연봉 : 2900 C사원의 연봉 : 2600 A사원 연봉/연봉+a : 2500/3500.0
		 * 3000 이상 B사원 연봉/연봉+a : 2900/2900.0 3000 미만 C사원 연봉/연봉+a :
		 * 2600/2989.9999999999995 3000 미만
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("A사원의 연봉을 입력해주세요 : ");
		int salaryA = sc.nextInt();
		System.out.print("B사원의 연봉을 입력해주세요 : ");
		int salaryB = sc.nextInt();
		System.out.print("C사원의 연봉을 입력해주세요 : ");
		int salaryC = sc.nextInt();
		double salaryA_insen = salaryA + salaryA * 0.4;
		double salaryC_insen = salaryA + salaryA * 0.15;
		if (salaryA_insen >= 3000) {
			System.out.println("A사원 연봉/연봉+a : " + salaryA + "/" + salaryA_insen + " 3000 이상");
		} else if (salaryA_insen < 3000) {
			System.out.println("A사원 연봉/연봉+a : " + salaryA + "/" + salaryA_insen + " 3000 미만");
		}
		
		if (salaryB >= 3000) {
			System.out.println("A사원 연봉/연봉+a : " + salaryB + "/" + (double)salaryB + " 3000 이상");
		} else if (salaryB < 3000) {
			System.out.println("A사원 연봉/연봉+a : " + salaryB + "/" + (double)salaryB + " 3000 미만");
		}
		
		if (salaryC_insen >= 3000) {
			System.out.println("A사원 연봉/연봉+a : " + salaryC + "/" + salaryC_insen + " 3000 이상");
		} else if (salaryC_insen < 3000) {
			System.out.println("A사원 연봉/연봉+a : " + salaryC + "/" + salaryC_insen + " 3000 미만");
		}
	}
}
