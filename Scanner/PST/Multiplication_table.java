package PST;

import java.util.Scanner;
public class Multiplication_table {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Enter a Number : " );
			int num = sc.nextInt();
			
			for(int i = 1; i <= 10; i++) {
				System.out.println(i + "x" + num + "=" +(num*i));
			}
			
			sc.close();
	}

}
