package logics;

import java.util.Scanner;

public class dynamicsumofarray {
public static void main(String[] args) {
	int sum=print();
	while(sum>9)
	{
		sum=add(sum);
	}
	System.out.println(sum);
}
static int print()
{
	System.out.println("enter the array size");
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int []arr=new int[size];
	for(int i=0;i<arr.length;i++)
	{
		System.out.println("enter the index value"+ i);
		arr[i]=sc.nextInt();
	}
				int sum=0;
		for(int i=0;i<arr.length;i++)
		{
		    sum+=arr[i];
		}
		return sum;
	}   
static int add(int no)
{
	int sum=0;
	while(no!=0)
	{
		int rem=no%10;
		sum=sum+rem;
		no=no/10;
	}
	return sum;
}
}
