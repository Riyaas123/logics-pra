package logics;

import java.util.Scanner;

public class A4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		 int count=0;
		 int count1=0;
		
		for (int i = 0; i <s1 .length(); i++)
		{
			char ch=s1.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
			count++;
			}
			else
			{
				count1++;
			}
		}
		System.out.println("vowels:-"+count);
		System.out.println("consonents:-"+count1);
	}

}
