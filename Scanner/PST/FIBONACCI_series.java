package PST;

import java.util.Scanner;
public class FIBONACCI_series {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter terms : ");
	int n = scanner.nextInt(), a=0,b=1;
	
	for(int i = 1; i <= n; i++) {
		System.out.println(a + " ");
		int next = a+b;
		a=b;
		b=next;
	}
	scanner.close();
		
	}

	}
