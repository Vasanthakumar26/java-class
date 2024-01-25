package JavaClass;

import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {
		
		int n,a,sum=0,number=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		n=sc.nextInt();
		
		
	    number=n;
	    
	    while (number>0)
	    {
			
	    	a = number % 10;
	       sum = sum + (a * a * a );
	       number = number / 10;       
			
		}
	    if (sum == n) 
	    {
		
	    	System.out.println("Armstrong Number");
		}
	    else 
	    {
		   System.out.println("Not Armstrong Number");	
		}
		
		
		
	}

}