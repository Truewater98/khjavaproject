package com.kh.day08.student;

public class Student {
	private String name = "";
	private int firstScore = 0;
	private int secondScore = 0;
	public Student() {}
	
	
	public Student(String name) {
		this(0,0);
		this.name = name;
	}
	
	public Student(int firstScore, int SecondScore) {
		this.firstScore = firstScore;
		this.secondScore = secondScore;
	}
	
	public Student(String name, int firstScore, int SecondScore) {
		this.name = name;
		this.firstScore = firstScore;
		this.secondScore = SecondScore;
	}

	public String getName() {
		return name;
	}
	
	public int getFirstScore() {
		return firstScore;
	}
	
	public int getSecondScore() {
		return secondScore;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setFirstScore(int firstScore) {
		this.firstScore = firstScore;
	}
		
	public void setSecondScore(int secondScore) {
		this.secondScore = secondScore;
	}
}

