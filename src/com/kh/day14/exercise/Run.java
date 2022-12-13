package com.kh.day14.exercise;

public class Run {
	public static void main(String[] args) {
		Exercise_IOStream io = new Exercise_IOStream();
		EXIT :
		while(true) {
			//int choice = io.menuPrint();
			switch(io.menuPrint()) {
			case 1: io.insert();
				break;
			case 2 : io.print();
				break;
			case 3 : io.save();
				break;
			case 4 : io.load();
				break;
			case 0 : break EXIT;
			default : System.out.println("1 ~ 4 사이의 숫자를 입력해주세요.");
			}
		}
	}
}
