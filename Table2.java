package day05;
import java.util.Scanner;

public class Table2 {
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number to print the table :");
		double num = obj.nextDouble();
		
		int i=1;
		do {
			System.out.println(num*i);
			i++;
		}while(i<=10);
	}
}
