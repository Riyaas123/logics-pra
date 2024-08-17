package logics;

public class vowels {
public static void main(String[] args) {
	String str="killa kila nan barakilla";
	{
		for(int i=0;i<str.length();i++){
			
		char ch=str.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.print(ch);
		}
	}
}
}
}
