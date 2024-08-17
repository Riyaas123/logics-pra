package logics;

public class singlech2anotherch {
public static void main(String[] args) {
	String str="java";
	int no=4;
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		if(ch=='j')
		{
		ch=(char)(ch+no);
		}
		System.out.print(ch);
	}
}
}