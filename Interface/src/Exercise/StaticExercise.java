package Exercise;

public class StaticExercise {
	  String empName = "Tame";
	  int salary = 4000;
	  static String city= "Addis ababa";
	
	public static void show() { 
		 System.out.println(city );
	}
	    
	public static void main(String[] args) {
				
		System.out.println(StaticExercise.city);
		
		StaticExercise xyz = new StaticExercise();
		System.out.println(xyz.empName);
		StaticExercise.show();
	    
	 
	}

}
