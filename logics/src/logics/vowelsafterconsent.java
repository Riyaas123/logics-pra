package logics;

public class vowelsafterconsent {
public static void main(String[] args) {
	String str="java";
	String vowels="";
	String consonent="";
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			vowels=vowels+ch;
		}
		else
			consonent=consonent+ch;
	}
System.out.println(consonent+" "+vowels);	
}
}