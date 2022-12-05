package com.kh.day09.overriding;

public class MathodOverridingEx {
	
	static void paint(Shape p) {
		p.draw();
	}
	public static void main(String[] args) {
		Line line = new Line();
		//line.draw();
		paint(line);
		paint(new Rect());
		paint(new Circle());
		
	}

}
