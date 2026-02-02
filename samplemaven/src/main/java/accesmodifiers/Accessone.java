package accesmodifiers;

public class Accessone {
	
	public void display1()
	{
		System.out.println("This is Public");
	
	}
	private void display2()
	{
		System.out.println("This is private");
	}
    protected void display3()
    {
    	System.out.println("This is protected");
    }
    void display4()
    {
    	System.out.println("Default ");
    }
	public static void main(String[] args) 
	{
	Accessone obj=new Accessone();
	obj.display1();
	obj.display2();
	obj.display3();
	obj.display4();
	}

}
