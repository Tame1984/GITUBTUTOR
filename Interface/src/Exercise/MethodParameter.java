package Exercise;

public class MethodParameter {
  public void myMethod(String fname) {
    System.out.println("my firest name is " + fname  );
	}

  public static void main(String[] args) {
    
	  MethodParameter par = new MethodParameter();
	  par.myMethod("Tame");
	  par.myMethod("Addis");
	  
	}

}
