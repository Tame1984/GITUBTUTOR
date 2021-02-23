package Exercise;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap {

	public static void main(String[] args) {
		java.util.HashMap<String, String> capitalCities = new java.util.HashMap<String, String>(); 
		capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
		capitalCities.put("ETH", "AA");
	    
		/*System.out.println(capitalCities);
	    System.out.println(capitalCities.get("Germany")); 
	    System.out.println(capitalCities.keySet());
	 
	    Set sm= capitalCities.entrySet();
	    Iterator it= sm.iterator();
	    while(it.hasNext());
	    {
	    	Map.Entry mp = (Map.Entry)it.next();
	    	System.out.println(mp.getKey());
	    	System.out.println(mp.getValue());
	    } */
	    
	    for (String i : capitalCities.keySet()) {
	    	System.out.println("key: " + i + " value: " + capitalCities.get(i));
	}

}
	
}
