package PST;

import java.util.Scanner;

public class problem2_convert {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");

        String str = sc.next();
        
        int n = Integer.parseInt(str);
        
        System.out.println("Integer value : " + n);
        sc.close();
    }
}
