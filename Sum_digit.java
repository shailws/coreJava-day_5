package day05;
import java.util.Scanner;

public class Sum_digit {
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number :");
		int number = obj.nextInt();
		
		int digit, sum=0;
		
		while(number>0) {
			digit = number%10;
			sum+=digit;
			number = number/10;
		}
		System.out.println("Sum of digit :" + sum);
	}
}
