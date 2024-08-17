package logics;

import java.util.Arrays;

public class smll3large {
public static void main(String[] args) {
	int[]arr={4,5,1,3,2};
	Arrays.sort(arr);
	int min=arr[1];
	int max=arr[arr.length-2];
	System.out.println(min+" "+max);
}
}
