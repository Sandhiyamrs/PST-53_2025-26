package PST;

import java.util.Scanner;
public class DIGIT_Count {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter a number: ");
		 int num = Math.abs(scanner.nextInt());
		 
		 int count = String.valueOf(num).length();
		 
		 System.out.print("Total digits: " + count);
		 
		 scanner.close();
	
	}

}
