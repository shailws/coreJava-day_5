package day05;
import java.util.Scanner;

public class Power {
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter base: ");
		int base = obj.nextInt();
		
		System.out.println("Enter index: ");
		int index = obj.nextInt();
		
		int power = 1;
		
		int i= 1;
		while(i<=index) {
			power = power * base;
			
			i++;
		}
		System.out.println("Power of number : " + power);
	}
}
