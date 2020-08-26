package com.zun;

public class Main {

    public static void main(String[] args) {
		Green green = new Green();
		Triangle triangle = new Triangle(green);
		print(triangle, 20, 3);

		Red red = new Red();
		Rectangle rectangle = new Rectangle(red);
		System.out.println();
		print(rectangle, 50, 2);
    }

    public static void print(Shape s, int border, int increment){
    	s.drawShape(border);
		s.modifyBorder(border, increment);
	}
}
