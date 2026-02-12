package collection;

import java.util.HashSet;
import java.util.Set;

public class ForEachLoop {

	public static void main(String[] args) 
	{
		Set <String> a = new HashSet <String> ();
		a.add("Red");
		a.add("Blue");
		a.add("Green");
		a.add("Black");
		a.add("Pink");
		
		System.out.println(a);
		for(String b:a)
		{
			System.out.println(b);
		}


	}

}
