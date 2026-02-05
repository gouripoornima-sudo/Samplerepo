package inheritance;

public class MultipleChild implements MultipleParent1,MultipleParent2 {
	
    public void display()
    {
    	System.out.println("Class Display");
    }
	public static void main(String[] args) {
		MultipleChild obj=new MultipleChild();
		obj.display();
		obj.print();
		obj.show();

	}

	@Override
	public void print() {
		System.out.println("Parent 1 -Print method");
		
	}

	@Override
	public void show() {
		System.out.println("Parent 2-show method");
		
	}

}
