package PST;

import java.util.Scanner;

public class problem_star {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the no. of stars : ");
        int n = sc.nextInt();
        
        horizontal(n);
        vertical(n);
        
    sc.close();
    }

     static void horizontal(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
    }
     static void vertical(int n) {
    	    for(int i = 0; i < n; i++) {
    	      	System.out.println(" * ");
    	    }
    }
  }


