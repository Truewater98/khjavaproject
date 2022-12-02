package com.kh.day08.oop;

public class Suit {
	private int size;
	private int price;
	private String brand;
	
	public Suit(int size) {
		this(size, "Hazzys");
		System.out.println("suit(int) 호출!");
	}
	
	public Suit(int size, String brand) {
		this(size, brand, 100000);
		System.out.println("Suit(int, String) 호출");
	}
	
	public Suit(int size, String brand, int price) {
		this.size = size;
		this.brand = brand;
		this.price = price;
		System.out.println("Suit(int,String,int) 호출");
	}
}
