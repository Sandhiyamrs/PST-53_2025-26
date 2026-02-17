package PST;

import java.util.Scanner;
public class Armstrong_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		
        int originalNum = num;
        int result = 0;
        int digits = 0;
        
        int temp = num;
        while (temp != 0) {
            temp /= 10;
            digits++;
        }
        
        temp = num;
        while (temp != 0) {
            int remainder = temp % 10;
            result += Math.pow(remainder, digits);
            temp /= 10;
        }
        
        if (result == originalNum)
            System.out.println(originalNum + " is an Armstrong number");
        else
            System.out.println(originalNum + " is Not an Armstrong number");

        sc.close();

	}

}
