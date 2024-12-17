package day05;

public class E_o_sum {
	public static void main(String args[]) {
		int even_sum = 0;
		int odd_sum = 0;
		int i=1;
		while(i<=30) {
			if(i%2==0) {
				even_sum+=i;
			}
			else {
				odd_sum+=i;
			}
			i++;
		}
		System.out.println("Even sum = " + even_sum);
		System.out.println("Odd sum = " + odd_sum);
	}
}
