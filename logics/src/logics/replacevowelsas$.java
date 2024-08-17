package logics;

public class replacevowelsas$ {
public static void main(String[] args) {
	String str="hello";
	for(int i=0;i<str.length();i++)
	{
char ch=str.charAt(i);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
{
	System.out.print("$");
}
else
{
	System.out.print(ch);
}
}
}
}