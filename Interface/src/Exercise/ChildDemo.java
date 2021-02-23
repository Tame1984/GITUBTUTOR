package Exercise;

public class ChildDemo extends ParenDemo
    
    {
   	 public void getdata()
	
	{
   	  super.getdata();
      System.out.println("I am in first class");
	}
	
    
	public static void main(String[] args) {
			
	ChildDemo ch =new ChildDemo();
    ch.getdata(); 
	
	}

}
