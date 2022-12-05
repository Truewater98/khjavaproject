package com.kh.day09.inheritance;

import com.kh.day09.point.Point;

class BlackPoint extends Point {
	void set() { // 부모의 멤버변수는 메소드 안에서!
		pub = 1;
		pro = 3;
		//def = 2; // The field Point.pri is not visible
		//pri = 4; // The field Point.pri is not visible
	}
}
class Child extends Parent {
	void set() {
		pub = 1;
		def = 2;
		pro = 3;
		//pri = 4; // The field Parent.pri is not visible
	}
}

class Parent {
	public int pub;
	int def;
	protected int pro;
	private int pri;
	
	private int money = 2000;
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money += money;
	}
}

public class Exam_Inheritance {
	public static void main(String[] args) {
		Child child = new Child();
		child.setMoney(3000);
		System.out.println("Parent money :" + child.getMoney());
	}
}
