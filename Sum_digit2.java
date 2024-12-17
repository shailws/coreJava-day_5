package day05;
import java.util.Scanner;

public class Sum_digit2 {
	public static void main(String args[]) {
		Scanner akash = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = akash.nextInt();
		
		int sum =0, digit; 
		
		while(num>0) {
			digit = num%10;
			sum += digit;
			num = num/10;
		}
		System.out.println("Sum of digit is : " + sum);
		
	}
}
