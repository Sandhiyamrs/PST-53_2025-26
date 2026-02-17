package PST;

import java.util.Scanner;

public class NUM_Palindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int num = scanner.nextInt(), original = num, reverse = 0;
		
		if(num > 0) {
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num /=10;
		}

			if (original == reverse) {
			System.out.println(original + "is a palindrome ");
			}
			
			else { 
				System.out.println(original + "is not a palindrome ");
			}
			
			scanner.close();
		}
	
	}
