package PST;

import java.util.Scanner;
public class convert_problem3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Double value : ");
		double d =  sc.nextDouble();
		
		String str = d + " ";
		
		System.out.println("String Result : " + str);
		sc.close();
	}

}
