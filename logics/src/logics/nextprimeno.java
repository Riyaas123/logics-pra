package logics;

public class nextprimeno
{
	public static void main(String[] args) {
		int n=1001;
		for(int j=n+1;j<=100000;j++)
		{
			int no=j;
			boolean flag=true;
			for(int i=2;i<=no;i++)
			{
				if(no%i==0)
				{
				flag=false;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println(no+"is prime no");
		}	
		else
		{
			System.out.println(no+"is not a prime no");
			break;
		}
	}
	}
}
