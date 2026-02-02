package PST;

import java.util.Scanner;
public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		
		int sum = 0;
		int temp = num;
		
		for(int i = 1;i <= temp/2;i++) {
			if(temp % i == 0) {
				sum += i;
			}
		}
		if(sum == num) {
			System.out.println(num + " is a Perfect Number");
		} else {
			System.out.println(num + " is not a Perfect Number");
			}
		
		sc.close();
		}
	}

