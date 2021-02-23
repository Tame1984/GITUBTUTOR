package Exercise;

public class ThisDemo {
	int a =3;
	public void getdata()
	{
	int a= 5;
	int b=a+this.a;
	System.out.println("a");
	System.out.println("this.a");
	System.out.println("b");
	}

	public static void main(String[] args) {
		
		ThisDemo de = new ThisDemo();
		de.getdata();
	}

}
