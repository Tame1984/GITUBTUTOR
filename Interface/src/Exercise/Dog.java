package Exercise;

public class Dog extends Animal{
	
    @Override
	public void behaviour() 
    {
		System.out.println("woo"); 
	}
    public static void main(String[] args) 
    {
    	//Animal A = new Dog();
    	//A.behaviour();
    	//A.sound();
    	Dog A = new Dog();
    	A.behaviour();
    	A.sound();
    	
	}

}
