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



package PST;

import java.util.Scanner;

public class convert_problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the character : ");
        char c = sc.next().charAt(0);

        int n = (int) c; 
        String str = "";

        while (n > 0) {
            int digit = n % 10;
            str = (char)(digit + 48) + str;
            n = n / 10;
        }

        System.out.println("String result : " + str);
        
        sc.close();
    }
}


