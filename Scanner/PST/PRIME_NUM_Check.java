package PST;

import java.util.Scanner;
public class PRIME_NUM_Check {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = scanner.nextInt(), count =0;
		
		for(int i=1; i <= n; i++) {
		   if(n % i == 0) count++;
		}

        if (count == 2) 
            System.out.print(n + " is Prime");
        else 
            System.out.print(n + " is Not Prime");
            
        scanner.close();

	}

}
