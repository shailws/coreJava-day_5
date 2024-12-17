package day05;
import java.util.Scanner;

public class Factorial2 {
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number to print factorial ");
		double num = obj.nextDouble();
		
		int factorial=1;
		
		int i=1;
		do {
			factorial*=i;
			i++;
		}while(i<=num);
		System.out.println("Factorial of nuber is : " + factorial);
	}
}
