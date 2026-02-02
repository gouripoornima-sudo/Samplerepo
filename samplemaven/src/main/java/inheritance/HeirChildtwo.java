package inheritance;

public class HeirChildtwo extends HeirParent{

	

		public void display()
		{
		System.out.println("This is child 2");	
		}
		public static void main(String[] args) 
		{
			HeirChildtwo obj=new HeirChildtwo();
			obj.Sum(10, 10);
			obj.display();
		}

	}
	

