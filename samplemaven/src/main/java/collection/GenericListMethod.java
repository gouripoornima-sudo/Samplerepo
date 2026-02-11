package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericListMethod {

	public static void main(String[] args) {
		List <String> s=new ArrayList <String>();
		s.add("Apple");
        s.add("Orange");
        s.add("Strawberry");
        s.add("Mango");
        System.out.println(s);
        System.out.println("@ Index 2"+ s.get(2));
        s.set(3,"Blueberry");
        System.out.println(s);
        
	}

}

