package Exercise;

import java.util.ArrayList;
import java.util.Iterator;

public class Myclass2 {
	
		  public static void main(String[] args) {

		    // Make a collection
		    ArrayList<String> cars = new ArrayList<String>();
		    cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
		    cars.add("Mazda");
		    Iterator<String> it = cars.iterator();
		    // Print the first item
		    String i= it.next();
		    while(it.hasNext()) {
		     if (i=="Mazda") {
		    	 System.out.println(it.next());
		     }
		    }
		  }
		}


