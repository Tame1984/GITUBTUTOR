package Exercise;

import java.util.Scanner;

public class ScannerInt {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in );
		System.out.println("print the first number:");
		int num1=scan.nextInt();
		
		System.out.println("Print the second number:");
		int num2=scan.nextInt();
		int num3 = num1+num2;
		System.out.println("sum of the two is "+ num3);
		
	}

}
