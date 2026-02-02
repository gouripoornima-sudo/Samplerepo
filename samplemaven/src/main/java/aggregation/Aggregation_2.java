package aggregation;

public class Aggregation_2 {
    String city,state;
    Aggregation_1 ref;
    public Aggregation_2(String city,String state,Aggregation_1 ref)
    {
    	this.city=city;
    	this.state=state;
    	this.ref=ref;
    }
	public void display()
	{
		System.out.println("Name="+ref.name);
		System.out.println("Rollno="+ref.rollno);
		System.out.println("Address="+ref.address);
		System.out.println("City="+city);
		System.out.println("State="+state);
	}
	
	public static void main(String[] args) 
	{
	Aggregation_1 obj=new Aggregation_1("Gouri",50,"Ernakulam");
	Aggregation_2 obj2=new Aggregation_2("Ernakulam","Kerala",obj);
	obj2.display();
	

	}

}
