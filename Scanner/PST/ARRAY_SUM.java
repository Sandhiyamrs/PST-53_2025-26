package PST;

import java.util.Scanner;
public class ARRAY_SUM {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of Array : ");
		int n = scanner.nextInt(), sum =0;
		int[] arr = new int[n];
		
		System.out.println("Enter the elements : ");
		for(int i=0; i < n; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
		}
		
		System.out.println("Sum of Array " +sum );
		
		scanner.close();
		
	}

}
