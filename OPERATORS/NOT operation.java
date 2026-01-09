import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		System.out.println("NOT operation");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num : ");
		int num = sc.nextInt();
		System.out.println(!(num==0));
		
	}
}
