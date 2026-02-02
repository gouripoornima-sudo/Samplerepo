package inheritance;

public class MultiChild extends MultiParent
{
   public void display3()
   {
	   System.out.println("Child ");
   }
	public static void main(String[] args) 
	{
		MultiChild obj =new MultiChild();
		obj.display1();
		obj.display2();
		obj.display3();

	}

}
