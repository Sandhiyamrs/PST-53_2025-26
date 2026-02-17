package PST;

import java.util.Scanner;
public class ARRAY_asc_des {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 5 elements : ");
		
		int a[] = new int[5];
		for(int i=0; i < 5; i++) {
			a[i] = scanner.nextInt();
		}
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<4; j++) {
				if(a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		 System.out.print("Ascending: ");
		 for(int n : a )System.out.print(n + " ");
		 
		 for(int i=0; i<5; i++) {
			 for(int j=0; j<4; j++) {
				 if(a[j] < a[j+1]) {
					 int temp = a[j];
					 a[j] = a[j+1];
					 a[j+1] = temp;
				 }
			 }
		 }
		 System.out.print("Descending : ");
		 for(int n : a)System.out.print(n + " ");
		 
		 scanner.close();
		 
		}
			
		}
		
	
