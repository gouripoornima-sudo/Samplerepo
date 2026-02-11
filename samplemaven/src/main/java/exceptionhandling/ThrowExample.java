package exceptionhandling;

public class ThrowExample {

	public static void main(String[] args) {
		int age=9;
		if(age>=18)
		{
			System.out.println("Eligible to Vote");
		}
		else
		{
			throw new ArithmeticException("Age under 18 ");
		}
	}

}
