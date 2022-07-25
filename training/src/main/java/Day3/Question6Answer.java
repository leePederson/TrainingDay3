package Day3;
class Monkey implements Question6{
	@Override
	public void sounds() {
		System.out.println("The monkey says: Ahh Ahh!");
	}
	@Override
	public void runs() {
		System.out.println("The monkey can run very fast!");
	}
}

public class Question6Answer {
	public static void main(String args[])
	{
		Monkey m1 = new Monkey();
		m1.runs();
	}	
}