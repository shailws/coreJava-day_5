package day05;

public class Even_odd_sum {
 public static void main(String args[]) {
	 int even_sum=0;
	 int odd_sum=0;
	 for(int i=1; i<=30; i++){
		 
		 if(i%2==0) {
			 even_sum+=i;
		 }
		 else {
			 odd_sum+=i;
		 }
	 }
	 System.out.println("Even sume = " + even_sum);
	 System.out.println("Odd sume = " + odd_sum);
 }
}
