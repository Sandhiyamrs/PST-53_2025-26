package PST;

import java.util.Scanner;

public class ASCII_problem4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string : ");
        String value = sc.nextLine();
        
        ASCIIValue(value);
        
        sc.close();
    }

    static void ASCIIValue(String str) {
        
        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i); 
            int ascii = (int) a;
            System.out.println(a + " = " + ascii);
        }
    }
}
