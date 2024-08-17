package logics;

import java.util.Scanner;

public class dynamicarray {
public static void main(String[] args) {
	System.out.println("enter the size");
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int[]arr=new int[size];
	
for(int i=0;i<arr.length;i++)
{
	System.out.println("enter "+i+ "  value");
	arr[i]=sc.nextInt();
}
}
}