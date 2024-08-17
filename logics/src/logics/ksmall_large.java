package logics;

public class ksmall_large {
public static void main(String[] args) {
int[]arr={1,2,3,4,5,6,7,8,9,10};
int k=2;
int min=arr[k-2];
int max=arr[arr.length-k];
System.out.println(min+" "+max);
}
}
