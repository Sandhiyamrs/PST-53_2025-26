package PST;

import java.util.Scanner;

public class ASCII_problem2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an ASCII value: ");
        int n = sc.nextInt();
        ASCIIValue(n);
        
        sc.close(); 
    }

    static void ASCIIValue(int n) {
        char result = (char) n;
        System.out.println("The character for ASCII " + n + " is: " + result);
    }
}

