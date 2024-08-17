package logics;

public class happynosta_sta {
static int addition(int no)
{
	int sum=0;
	while(no!=0)
	{
		int rem=no%10;
		sum=sum+(rem*rem);
		no=no/10;
	}
	return sum;
}
public static void main(String[] args) {
	int no=13;
	while(no>9)
		 no=addition(no);
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
