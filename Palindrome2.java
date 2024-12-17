package day05;
import java.util.Scanner;

public class Palindrome2 {
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = obj.nextInt();
		int r, sum=0, curr;
		
		curr = n;
		do {
			r = n%10;
			sum = (sum*10)+r;
			n=n/10;
		}while(n>0);
		
		if(curr == sum) {
			System.out.println(sum +" Number is palindrome");
		}
		else {
			System.out.println(sum +" Number is not palindrome");
		}
	}
}
