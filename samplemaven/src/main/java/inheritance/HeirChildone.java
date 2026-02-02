package inheritance;

public class HeirChildone extends HeirParent {

	public void display()
	{
	System.out.println("This is child 1");	
	}
	public static void main(String[] args) 
	{
		HeirChildone obj=new HeirChildone();
		obj.Sum(8, 9);
		obj.display();
	}

}
