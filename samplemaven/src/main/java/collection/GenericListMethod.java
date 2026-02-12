package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericListMethod {

	public static void main(String[] args) {
		List <String> s=new ArrayList <String>();
		s.add("Apple");
        s.add("Orange");
        s.add("Apple");
        s.add("Strawberry");
        s.add("Mango");
        s.add("Kiwi");
        System.out.println(s);
        System.out.println("@ Index 2"+ s.get(2));
        s.set(3,"Blueberry");
        System.out.println(s);
        System.out.println("Index of"+s.indexOf("Mango")); 
        System.out.println("lastindexof : "+s.lastIndexOf("Mango"));
        s.remove("Apple");
        System.out.println(s);
        System.out.println("Contains" +s.contains("Kiwi"));
        System.out.println("Is empty? :"+s.isEmpty());
        System.out.println(s.size());
        
        
	}

}

