package Exercise;

import java.util.Scanner;

public class Palindrom1 {

	public static void main(String[] args) {
		String original, reverse = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("reverse the string ");
		original = scan.nextLine();
		for(int i= original.length()-1; i>=0; i--)
		reverse = reverse+ original.charAt(i);
		System.out.println("The reverse of the string is " +reverse);

	}

}
