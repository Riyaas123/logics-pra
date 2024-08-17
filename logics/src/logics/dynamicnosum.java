package logics;

import java.util.Scanner;

public class dynamicnosum {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a value");
	int no=sc.nextInt();
	int sum=0;
	int copy=no;
	while(no!=0)
	{
		int rem=no%10;
		sum=sum+rem;
		no=no/10;
	}
	System.out.println(sum);
}
}
