package day05;

public class Prime_do {
	public static void main(String args[]) {
		int num1 = 101;
		int num2 = 150;
		int i,j;
		for(i=num1;i<=num2;i++) {
			for(j=2;j<=i;j++) {
				if(i%j==0) {
					break;
				}
			}
			if(i==j) {
				System.out.println(j);
			}
		}
	}
}
