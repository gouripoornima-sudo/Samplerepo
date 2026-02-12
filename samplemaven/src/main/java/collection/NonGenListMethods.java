package collection;

import java.util.ArrayList;
import java.util.List;

public class NonGenListMethods {

	public static void main(String[] args) 
	{
		List a=new ArrayList();
		a.add(1);
		a.add("Apple");
		a.add(250.5f);
		a.add("Sunflower");
		a.add(840);
		a.add("Apple");
		a.add(65048);
		System.out.println(a);
		System.out.println("Element at index 2 :"+a.get(2));
		System.out.println("To set a new value at index 4 :"+a.set(4,"Hello"));
		System.out.println(a);
		System.out.println("First Occurance of Apple at :"+a.indexOf("Apple"));
		System.out.println("Last Occurance of Apple at : "+a.lastIndexOf("Apple"));
		a.remove(4);
		System.out.println("After removing Hello  : "+a);
		System.out.println("Is a Empty? :"+a.isEmpty());
		System.out.println("Size of a :"+a.size());
		
		

	}

}
