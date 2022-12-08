package palindrome;

import java.util.Scanner;

public class Palindrom {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the number");
	int n = scan.nextInt();
	int x = n;
	int d;
	int rev =0;
	while(n!=0)
	{
		d = n%10 ;
		
		rev = rev *10 + d;
		
		n= n/10;
		
		
	}
	if(rev == x)
	{
	System.out.println("palindrome");
	}
	else {
		System.out.println("not a pallindrome");
	}
}}
