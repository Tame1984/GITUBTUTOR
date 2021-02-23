package Exercise;

public class Addition {
	int a = 56;
	int b= 300;
	int c= 400;
	int z= a+b+c;
	int x= a*b;
    public void sum () {
    	System.out.println( z);
    }
    public void multiplication()
    {
    System.out.println(x);	
    }
	public static void main(String[] args) {
		Addition xy= new Addition();
		xy.sum();
		System.out.println(xy.a);
		xy.multiplication();

	}

}
