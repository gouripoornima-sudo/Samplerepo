package polymorphism;

public class PolyChild extends PolyParent {
	public void print(int a,int b)
	{
		super.print(18, 5);
		int sub=a-b;
		System.out.println("Subtraction ="+sub);
	}

	public static void main(String[] args) 
	{
	 PolyChild obj=new PolyChild();
	 obj.print(10,5);

	}

}
