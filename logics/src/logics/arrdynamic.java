package logics;
	import java.util.Scanner;
	public class arrdynamic {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Get the size of the array from the user
	        System.out.print("Enter the size of the array: ");
	        int size = sc.nextInt();

	        // Declare an array of the specified size
	        int[] myArray = new int[size];

	        // Get elements of the array from the user
	        System.out.println("Enter elements of the array:");

	        for (int i = 0; i < size; i++) {
	            System.out.print("Enter element at index " + i + ": ");
	            myArray[i] = sc.nextInt();
	        }

	        // Display the elements of the array
	        System.out.println("Elements of the array:");

	    }
	}
	