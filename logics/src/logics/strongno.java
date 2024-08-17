package logics;

public class strongno {
	static int fact(int no)
	{
		int fact=1;
		for(int i=no;i>=1;i--){
			fact=fact*i;
		}
		return fact;
	}
	static int add(int no)
	{
		int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			sum=sum+fact(rem);
			no=no/10;
		}
		return sum;
	}
	public static void main(String[] args) {
	int no=145;
    int copy=add(no);
	if(no==copy)
	{
		System.out.println(no+"is a strong no");
	}
	else
	{
		System.out.println(no+"not a strong no");
	}
}
}
