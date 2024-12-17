package day05;
import java.util.Scanner;

public class Table1 {
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number to print the table: ");
		double num = obj.nextDouble();
		double table;
		int i=1;
		while(i<=10) {
			table = num*i;
			System.out.println(table);
			i++;
		}
	}
}
