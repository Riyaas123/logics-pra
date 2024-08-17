package logics;

import java.util.Scanner;

public class Stringrevdynamicin {
public static void main(String[] args) {
	String rev="";
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value");
	String str=sc.nextLine();
	for(int i=str.length()-1;i>=0;i--)
	{
		rev=rev+str.charAt(i);	
	}
	System.out.println(rev); 
}

}