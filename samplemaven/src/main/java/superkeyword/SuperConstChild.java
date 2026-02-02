package superkeyword;

public class SuperConstChild extends SuperConstParent
{  
	public SuperConstChild()
	{
		super(5);
		System.out.println("Super Constructor -CHild");
		
	}

	
	public static void main(String[] args) {
		SuperConstChild obj=new SuperConstChild();
		

	}

}
