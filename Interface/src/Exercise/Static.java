package Exercise;
public class Static {
	String empName;
	static int salary;
	public void show() 
	{
	 System.out.println(empName+ " " +salary );
	}
    
	public static void main(String[] args) {
	 Static obj = new Static();
	 obj.empName = "Tame";
	 Static.salary = 4000;
	 
	 
	}

}
