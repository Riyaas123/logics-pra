package logics;

public class no_rev {
public static void main(String[] args) {
	int no=1234;
	int reverse=0;
	while(no!=0)
	{
		int rem=no%10;
		reverse=(reverse*10)+rem;
	no=no/10;
	}
System.out.println(reverse);
}
}