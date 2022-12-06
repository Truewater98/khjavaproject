package com.kh.day10.interfaceex;

public interface PhoneInterface {
	// Illegal modifier for the interface field PhoneInterface.name; only public, static & final are permitted
	public String NAME = "";
//	name = "Hello world"; // X, ������̶� �ٲ��� ����.
	public static final int TIME_OUT = 10000;
	public abstract void sendCall();
	public abstract void receiveCall();
	// Abstract methods do not specify a body
	abstract void printLogo();
	void displayNumber();
	public default void showLogo() { // ����Ʈ �޼ҵ�
		// ���� ȣȯ���� ���ؼ� �ۼ��Ѵ�.
		// ��, ���� ȣȯ���� �����ϰ� �������̽��� ������ ���� �ۼ�
		System.out.println("** LG **");
	}
}
