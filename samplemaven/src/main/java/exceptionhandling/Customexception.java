package exceptionhandling;

public class Customexception {

	public static void main(String[] args) throws VotingException, AgeException {
		int age=9;
		if(age>=18)
		{
			System.out.println("Eligible to Vote");
		}
		else
		{
			throw new AgeException("Age under 18 ");
		}

	}

}
