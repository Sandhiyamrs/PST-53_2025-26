package PST;

import java.util.Scanner;
public class convert_problem2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string : ");
        String str = sc.next();
        
        int result = 0;
        
        for (int i = 0;i < str.length();i++) {
        	char a = str.charAt(i);
        	int digit = a - 48;
        	result = result * 10 + digit;
        	
        }
        System.out.println("Integer Result : " + result );
        sc.close();
       
    }
}

