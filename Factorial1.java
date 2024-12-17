package day05;
import java.util.Scanner;

public class Factorial1 {
	public static void main(String args[]) {
		
		double factorial = 1;
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number: ");
		double num = obj.nextDouble();
		
		int i=1;
		while(i<=num) {
			factorial*=i;
			i++;
		}
		System.out.println("Factorial of your number :" + factorial);
	}
}
