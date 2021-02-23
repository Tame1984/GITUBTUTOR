package Exercise;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		
		Date d =new Date ();
		System.out.println(d.toString());//Generic date time format
		//to change the date format into the require format 
		SimpleDateFormat sdf =new SimpleDateFormat("d/M/yyyy");
		System.out.println(sdf.format(d));
         

	}

}
