package logics;

public class lowertoupper {
public static void main(String[] args) {
String str="mava";
for(int i=0;i<str.length();i++)
{
	char ch=str.charAt(i);
	ch=(char) (ch-32);
	System.out.print(ch);
}
}
}