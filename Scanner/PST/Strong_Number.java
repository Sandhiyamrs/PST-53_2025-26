package PST;

import java.util.Scanner;
public class Strong_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		
		int originalNum = num;
		int sum = 0;
		
		while (num > 0) {
			
			int fact = 1;
			for(int i = 1;i <= 0;i++) {
			   fact *= i;
			  
			}
			sum += fact;
			num /= 10;
		}
		
			if(sum == originalNum) {
				System.out.println( originalNum + " is a Strong Number");
			} else {
				System.out.println( originalNum + " is not a Strong Number");
				}
		sc.close();
		}

	}
