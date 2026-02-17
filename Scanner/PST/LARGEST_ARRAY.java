package PST;

import java.util.Scanner;
public class LARGEST_ARRAY {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) arr[i] = scanner.nextInt();
        
        int max = arr[0]; 
        for (int i = 1; i < size; i++) {
            if (arr[i] > max) { 
                max = arr[i]; 
                
            }
        }
        
        System.out.println("The largest element is: " + max);
        scanner.close();
        
	}

}

