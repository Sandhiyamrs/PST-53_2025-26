package PST;

import java.util.Scanner;
public class Simple_Interest_Calc {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		
		 System.out.println("Enter Principal (P): ");
		 float P = sc.nextFloat();
		
		 System.out.println("Enter Rate (R): ");
		 float R = sc.nextFloat();
		 
		 System.out.println("Enter Time (T): ");
		 float T = sc.nextFloat();
		 
		 float SI = (P*R*T)/100;
		 
		 System.out.println("SimpleInterest " +SI);
		
		 sc.close();
	}

}
