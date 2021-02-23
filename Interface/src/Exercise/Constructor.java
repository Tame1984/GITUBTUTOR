package Exercise;

public class Constructor {

	public Constructor() 
	{
	System.out.println("Tamirat");	
	}
	
	public Constructor(int A,int B) 
	{
	System.out.println("2, 4");	
	}
	
	public Constructor(String str) 
	{
	System.out.println(str);	
	}

	public static void main (String[]argas) {
	
		Constructor cn = new Constructor();
		Constructor c = new Constructor(2 ,4);
		Constructor ct = new Constructor("hellow");
	
	}
	
}
