package logics;

public class no_rev_pali {
	public static void main(String[] args) {
	int no=1234;
	int reverse=0;
	int copy=no;
	while(no!=0)
	{
		int rem=no%10;
		reverse=(reverse*10)+rem;
		no=no/10;
	}
if(copy==reverse){
	System.out.println("palindrome");
}
else
{
	System.out.println("not a palindrome");
}
	}
}