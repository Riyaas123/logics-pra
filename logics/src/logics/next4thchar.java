package logics;

public class next4thchar {
	public static void main(String[] args) {
String str="hello";
int no=4;
for(int i=0;i<str.length();i++)
{
	char ch=str.charAt(i);
	ch=(char)(ch+no);
	System.out.print(ch);
}
}
}