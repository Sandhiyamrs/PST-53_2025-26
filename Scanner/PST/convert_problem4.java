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

