package PST;

import java.util.Scanner;
public class STRING_Length {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("Enter a string: ");
	        String str = sc.nextLine();
	        
	        int count = 0;
	        
	        char[] charArray = str.toCharArray();
			for (int i = 0; i < charArray.length; ) { 
				count++;
				i++;
			}
	        System.out.println("The length of the string is: " + count);
	        
	        sc.close();
	    }
	}
