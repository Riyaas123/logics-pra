package logics;

public class happynum {
public static void main(String[] args) {
	int sum=0;
	int no=13;
	while(no!=0)
	{
		int rem=no%10;
		sum=sum+(rem*rem);
		no=no/10;
	}
if(no==1||no==7)
{
	System.out.println("happy no");
	
}
else
{
	System.out.println("sad no");
}
}
}