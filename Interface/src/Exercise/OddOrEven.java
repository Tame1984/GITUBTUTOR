package Exercise;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		//int A = 9;
		Scanner myObj = new Scanner(System.in);  
	    System.out.println("Enter username");
	    int num = myObj.nextInt();
		
	  	if (num%2==0) {
			System.out.println("even number");
		}
		
		else {
			System.out.println("Odd numer");
		}		
	}

}
