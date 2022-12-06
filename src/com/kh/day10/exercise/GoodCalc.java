package com.kh.day10.exercise;

public class GoodCalc extends Calculator {
	@Override
	public int add(int a, int b) {
		return a + b;
	}
	
	@Override
	public int substract(int a, int b) {
		return a - b;
	}
	
	@Override
	public double average(int[] a) {
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i]; 
		}
		return (double)sum / a.length;
	}
	
	public static void main(String[] args) {
		int[] nums = {1, 2, 4};
		GoodCalc calc = new GoodCalc();
		System.out.println("�� : " + calc.add(1, 2));
		System.out.println("�� : " + calc.substract(4, 2));
		System.out.println("��� : " + calc.average(nums));
	}
}
