package PST;

import java.util.Scanner;
public class STRING_Vowels {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int count = 0;
		System.out.println("Enter a string : ");
		String str = scanner.nextLine();
		
		for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if(ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == '0'|| ch =='u') {
            	count++;
            }
		}
          System.out.println("Number of vowels in the strings :" +count);
          
          scanner.close();
	}

}
