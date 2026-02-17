package PST;

import java.util.Scanner;
public class convert_problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the integer : ");
        int n = sc.nextInt();
        String str = " ";

   while (n > 0) {
            int digit = n % 10;
            str = (char)(digit + 48) + str;
            n = n / 10;
        }

        System.out.println("String result : " + str);
        
        sc.close();
    }
}