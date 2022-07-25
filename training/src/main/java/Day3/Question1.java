package Day3;

import java.util.Scanner;

class Rectangle extends Shape{
	public Rectangle(){
		super(4);
		width = 1;
		length = 2;
	}
	public Rectangle(int x, int y){
		super(4);
		width = x;
		length = y;
	}

	private int width;
	private int length;
	public void setWidth(int x) {width = x;}
	public void setLength(int x) {length = x;}
	public int getArea() {
			int area = width*length;
			System.out.println("Area of rectangle is:");
			System.out.println(area);
			return(area);
	}
	public void identifier() {System.out.println("This is a rectangle");}
}

class Square extends Rectangle{

	Square() {
		super(1,1);
	}
	Square(int x){
		super(x, x);
	}
//	private int sideLength;
//	public int getArea(){
//		return (sideLength*sideLength);
//	}
	public void identifier() {System.out.println("This is a square");}

}
public class Question1 {
	public static void main (String arg[]){
		int height = 3;
		int width = 2;
		int sides = 4; 
		Rectangle r1 = new Rectangle(width, height);
		r1.getSides();// Although this is a rectangle, it is using a shape function, inheritance

	}
}


abstract class Shape{
	private int sides;
	public void setSides(int numSides) {sides=numSides;}
	public void Shape() {
		sides = 0;
	}
	Shape(int numSides){
		sides =numSides;
		}
	final public void getSides()
	{
		System.out.println("Number of sides is:");
		System.out.println(sides);
	}
	abstract void identifier();
		
}