package logics;

public class withoutfor_inbuilt_equals_charat {
public static void main(String[] args) {
	String str="level";
	char[]ch=str.toCharArray();
	if(palindrome(ch))
	{
		System.out.println("palindrome");
	}
	else
	{
		System.out.println("not a palindrome");
	}
}
	static boolean palindrome(char[]ch){
		
	int i=0;int j=ch.length-1;
	while(i<j)
	{
		if(ch[i]!=ch[j])
		{
			return false;
		}
		i++;j--;
	}
	return true;
}
}
