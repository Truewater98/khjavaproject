package com.kh.day10.abstractex;

abstract class Line extends Shape{
	//The type Line must implement the inherited abstract method Shape.draw()
}

public abstract class Shape {
	// The type Shape must be an abstract class to define abstract methods
	public Shape() {}
	public void paint() {}
	public abstract void draw();
	// Abstract methods do not specify a body
	// The abstract method draw in type Shape can only be defined by an abstract class 
}
