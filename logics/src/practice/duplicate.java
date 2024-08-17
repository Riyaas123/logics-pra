package practice;

import java.util.LinkedHashSet;

public class duplicate {
public static void main(String[] args) {
	String str="Riyaas mohamed";
	LinkedHashSet<Character> l=new LinkedHashSet();
	for(int i=0;i<str.length();i++)
	{
		if(!(l.add(str.charAt(i)))){
			System.out.print(str.charAt(i));
		}
	}
}
}
