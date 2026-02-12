package collection;

import java.util.HashSet;
import java.util.Set;

public class GenericSetMethods {

	public static void main(String[] args) {
		Set <String> a = new HashSet <String> ();
		a.add("Red");
		a.add("Blue");
		a.add("Green");
		a.add("Black");
		a.add("Pink");
		System.out.println(a);
		Set <String> b= new HashSet <String> ();
		b.add("Rose");
		b.add("Lilly");
		b.add("Sunflower");
		System.out.println(b);
		a.addAll(b);
		System.out.println(a);
		System.out.println("Contains Pink :"+a.contains("Orange"));
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
