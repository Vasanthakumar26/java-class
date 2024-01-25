package JavaClass;

import java.util.Scanner;

public class StringManipulation {
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number:");
		String number=sc.next();
		
		String up=number.toUpperCase();
		String low=number.toLowerCase();
		
		System.out.println(up);
		System.out.println(low);
		
	    int len=number.length();
		System.out.println(len);	    
		
}
}