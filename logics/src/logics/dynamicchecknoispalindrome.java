package logics;

import java.util.Scanner;

public class dynamicchecknoispalindrome {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a value");
	int no=sc.nextInt();
	int rev=0;
	int copy=no;
	while(no!=0)
	{
		int rem=no%10;
		rev=(rev*10)+rem;
		no=no/10;
	}
if(copy==rev)
{
	System.out.println("palindrome");
}
else
{
	System.out.println("not a palindrome");
}
}
}