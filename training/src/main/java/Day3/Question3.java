package Day3;

public class Question3 {
	public static void main(String args[])
	{
		Square s1 = new Square(4);
		s1.identifier();// Identifier is an overloaded function
		Rectangle r1 = new Rectangle();
		int r1Area = r1.getArea();
		Rectangle r2 = new Rectangle(2, 3);//constructor overloaded
		int r2Area = r2.getArea();
		
	}	
}
