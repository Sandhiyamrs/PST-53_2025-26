package PST;

import java.util.Scanner;
public class convert_problem4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Character : ");
		char a = sc.next().charAt(0);
		
		char[] arr = {a};
		String str = new String(arr);
		
		System.out.println("String Result : " + str);
		sc.close();				
	}

}
