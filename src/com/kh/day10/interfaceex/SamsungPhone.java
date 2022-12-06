package com.kh.day10.interfaceex;

// The type PhoneInterface cannot be the superclass of SamsungPhone; a superclass must be a class
public class SamsungPhone implements PhoneInterface {

	@Override
	public void sendCall() {
		System.out.println("뚜루루루루");
	}

	@Override
	public void receiveCall() {
		System.out.println("여보세요 나야");
	}

	@Override
	public void printLogo() {
		System.out.println("====== Samsung =====");
	}

	@Override
	public void displayNumber() {
		System.out.println("내 휴대전화 정보 : xxx-xxxx-xxxx");
	}
	
	public void flash() {
		System.out.println("반짝반짝 불이 켜졌습니다.");
	}
}
