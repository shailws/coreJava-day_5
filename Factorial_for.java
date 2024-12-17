package day05;
import java.util.Scanner;

public class Factorial_for {
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = obj.nextInt();
		
		int factorial = 1;
		
		for(int i=1; i<=num; i++) {
			factorial*=i;
		}
		System.out.println("Factorial of number :" + factorial);
	}
}
