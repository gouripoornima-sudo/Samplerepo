package interfaceexample;

public class Child implements Parent{
    public void show()
    {
    System.out.println("This is method in child class");
    }
	public static void main(String[] args) {
		/*Child obj=new Child();
		obj.show();
		obj.display();
		obj.print();*/
		//Reference Creation
		Parent ref=new Child();
		ref.display();
		ref.print();


	}
	@Override
	public void print() {
		System.out.println("This is Print from interface Parent ");
		
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("This is Display from interface Parent ");
	}

}
