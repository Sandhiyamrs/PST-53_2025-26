package PST;

import java.util.Scanner;
public class ARRAY_Sum_Avg {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
        int n, sum = 0;
        float average;
        
        System.out.print("Enter the number of elements you want in the array:");
        n = scanner.nextInt();

        int[] a = new int[n];
        
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt(); 
            sum = sum + a[i];   
        }
scanner.close();

        System.out.println("Sum:" + sum);

        average = (float) sum / n;
        System.out.println("Average:" + average);
	}
}
