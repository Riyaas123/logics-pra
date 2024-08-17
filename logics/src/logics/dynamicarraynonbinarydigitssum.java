package logics;

import java.util.Scanner;

public class dynamicarraynonbinarydigitssum {
public static void main(String[] args) {
	System.out.println("enter the array size");
Scanner sc=new Scanner(System.in);
int size=sc.nextInt();
int[]arr=new int[size];
for(int i=0;i<arr.length;i++)
{
	System.out.println("enter the index value"+ i );
	arr[i]=sc.nextInt();
}
int sum=0;
for(int i=0;i<arr.length;i++)
{
	if((arr[i]!=0) && (arr[i]!= 1))
	sum=sum+arr[i]*arr[i];
}
System.out.println(sum);
}
}