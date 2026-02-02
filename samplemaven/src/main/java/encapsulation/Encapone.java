package encapsulation;

public class Encapone {
	private int rollno;
	private String name;
	public void setter(String name,int rollno)
	{
	this.rollno=rollno;
	this.name=name;
	}
	public void getter()
	{
		System.out.println(name);
		System.out.println(rollno);
	}


}
