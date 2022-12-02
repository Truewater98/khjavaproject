package com.kh.day08.oop;

class Circle{
	int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	public double getArea() {
		double area = 3.14*radius*radius;
		return area;
	}
}
public class CircleArray {
	public static void main(String[] args) {
		Circle[] c = new Circle[5];
		for(int i = 0; i < c.length; i++) {
			c[i] = new Circle(i); // 이때 화살표가 생김
		}
		// 객체 배열 출력
		for(int i = 0; i < c.length; i++) {
			System.out.print(c[i].getArea()+ " ");
		}
	}

}
