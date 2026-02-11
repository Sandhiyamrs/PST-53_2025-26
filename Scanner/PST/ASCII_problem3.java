package PST;

import java.util.Scanner;
public class ASCII_problem3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Upper Case from A to Z : ");
		ASCIIValue('A','Z');
		System.out.println("\nLower Case from a to z : ");
		ASCIIValue('a','z');
		
		sc.close();

	}
    static void ASCIIValue(char start,char end) {
    	  for(char c = start; c <=end; c++) {
    		  int ascii = (int) c;
    		  System.out.println( c + " = " + ascii);
    	  }
    	  }

}
