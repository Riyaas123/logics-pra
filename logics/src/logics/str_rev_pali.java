package logics;

public class str_rev_pali {
public static void main(String[] args) {
	String str="ava";
	String reverse="";
	for(int i=str.length()-1;i>=0;i--)
	{
		reverse=reverse+str.charAt(i);
	}
if(str.equals(reverse))
{
System.out.println("palindrome");	
}
else
{
	System.out.println("not a palindrome");
}
}
}