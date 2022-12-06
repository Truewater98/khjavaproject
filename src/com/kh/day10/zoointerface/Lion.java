package com.kh.day10.zoointerface;

public class Lion extends Animal implements Predator{

	@Override
	public String animalfood() {
		return "gazel";
	}

}
