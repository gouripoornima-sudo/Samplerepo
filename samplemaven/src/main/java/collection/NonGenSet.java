package collection;

import java.util.HashSet;
import java.util.Set;

public class NonGenSet {

	public static void main(String[] args)
	{
		Set  a = new HashSet();
		a.add("Red");
		a.add(20);
		a.add(505.5f);
		a.add("Black");
		a.add("Pink");
		System.out.println(a);
		Set  b= new HashSet ();
		b.add("Rose");
		b.add(856475.5f);
		b.add("Sunflower");
		System.out.println(b);
		a.addAll(b);
		System.out.println(a);
		System.out.println("Contains Orange :"+a.contains("Orange"));
		System.out.println("ContainsAll :"+a.containsAll(b));
		System.out.println("Is empty ? :"+a.isEmpty());
		System.out.println("To remove :"+ a.remove("Green"));
		System.out.println(a);
		a.removeAll(b);
		System.out.println(a);
		System.out.println("Size of a "+a.size());
		b.clear();
		System.out.println(b);
	}

	}


