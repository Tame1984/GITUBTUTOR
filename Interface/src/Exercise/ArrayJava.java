package Exercise;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayJava {
	  public static void main(String[] args) {
	    ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	   /* System.out.println(cars);
	    System.out.println(cars.get(2));
	    cars.set(0, "Opel");
	    cars.remove(0);
	    cars.clear();
	    cars.size();*/
	    Collections.sort(cars);
	    for (int i = 0; i < cars.size(); i++) {
	    	System.out.println(cars.get(i));
	    }
	  
	    
	  }
	}