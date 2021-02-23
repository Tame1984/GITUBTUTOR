package Exercise;

import java.util.HashSet;

public class HashSet1<T> {

	public static void main(String[] args) {
		HashSet <String> cars = new HashSet <String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("BMW");
	    cars.add("Mazda");
	   System.out.println(cars);
		
	    for(String i: cars) {
	    	
	    	if(i=="Ford")
	    	{
	    		System.out.println("Car is "+ i);
	    	}
	    }
	}

	
		
	}


