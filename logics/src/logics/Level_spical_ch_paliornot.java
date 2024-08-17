package logics;

public class Level_spical_ch_paliornot {
public static void main(String[] args) {
String str="L@#EV234EL";
String rev="";
for(int i=str.length()-1;i>=0;i--)
{
	rev=rev+str.charAt(i);
}
System.out.println(str.replaceAll("[@#0-9]",""));
String str1=rev;
if(str1.equals(rev))
{
	System.out.println("Level is a palindrome");
}
else
{
	System.out.println("not a palindrome");
}
}
}