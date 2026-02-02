package superkeyword;

public class Supervariablechild extends Supervariable
{
 int a=6;
 public void display()
 {  
	
	// System.out.println(a);
	 System.out.println(super.a);
 }
	public static void main(String[] args) 
	{
	Supervariablechild obj=new Supervariablechild();
	obj.display();

	}

}
