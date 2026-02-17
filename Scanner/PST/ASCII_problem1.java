package PST;

import java.util.Scanner;
public class ASCII_problem1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Character : ");
		char inputChar = sc.next().charAt(0);
		
		ASCIIValue(inputChar);
		
		sc.close();
	}
	
	static void ASCIIValue(char ch) {
		int ascii = (int) ch;
		System.out.println("The ASCII Value of " + ch + " is : " + ascii );
		
	}
}
