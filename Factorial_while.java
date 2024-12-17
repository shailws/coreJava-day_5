package day05;
import java.util.Scanner;

public class Factorial_while {
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = obj.nextInt();
		
		int factorial = 1;
		
		int i=1;
		while(i<=num) {
			factorial*=i;
			i++;
		}
		System.out.println("Factorial of number : " + factorial);
	}
}
