package superkeyword;

public class SupermethodChild extends SupermethodParent
{
	public void display()
	{
		super.display();
		//System.out.println(" Super method -Child ");
		
	}

	public static void main(String[] args) 
	{
	SupermethodChild obj=new SupermethodChild();
	obj.display();

	}

}
