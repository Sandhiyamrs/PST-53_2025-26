package PST;

import java.util.Scanner;
public class problem1_convert {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the integer : ");
		int n = sc.nextInt();
		
		String str = String.valueOf(n);
		
		System.out.println("String result : " + str);
		
		sc.close();

	}

}