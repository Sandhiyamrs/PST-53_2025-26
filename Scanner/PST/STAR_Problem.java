package PST;

import java.util.Scanner;

public class STAR_Problem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter H : ");
        int h = sc.nextInt();
        
        System.out.print("Enter W : ");
        int w = sc.nextInt();

        for (int i = 1; i < (h + w); i++) {
            if (i < h) {
            	
                System.out.println("*");
                
            } else {
            	
                System.out.print("* ");
            }
  }

        sc.close();
    }
}





