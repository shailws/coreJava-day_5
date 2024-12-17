package day05;
import java.util.Scanner;

public class Palindrome {
	 public static void main(String args[]){  
		 
		 Scanner obj = new Scanner(System.in);
		 System.out.println("Enter a number :");
		 int n = obj.nextInt();
		 
		  int r,sum=0,curr;    
		  
		  curr=n;   
		  
		  while(n>0){    
		   r=n%10;   
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(curr==sum)    
		   System.out.println(sum+" is palindrome number ");    
		  else    
		   System.out.println(sum+" is not palindrome");    
		}
}
