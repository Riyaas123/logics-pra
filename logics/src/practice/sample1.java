package practice;

import java.util.Arrays;
import java.util.Scanner;

public class sample1
{
	 public static void main( String args[] ){ 
	        int num; 
	        Scanner sc = new Scanner( System.in ); 
	        System.out.print("Input a number: "); 
	        num = sc.nextInt(); 
	        int num_of_digits = 0, divisor_part=1, circular_num = num; 
	        boolean allPrime = true; 
	        for( int i = num; i > 0; i /= 10 ){
	            num_of_digits++;
	            divisor_part *=10;
	        }
	        divisor_part /=10;
	        do{
	            circular_num = circulate_func( circular_num, divisor_part );
	            if( !isPrime( circular_num ) ) allPrime=false;
	        }while( circular_num != num );
	        if( allPrime ) System.out.println("It is Circular prime." );
	        else System.out.println("It is not a Circular Prime " );
	    }


		public static boolean isPrime( int n ){
	        int Count = 0;
	        if( n < 2 ) return false;
	        else if( n == 2 ) return true;
	        else if( n % 2 == 0 ) return false;
	        else{
	            int num = (int) Math.sqrt( n );
	            for( int i = 3 ; i <= num; i+=2 ){
	                if( n %i == 0 ){
	                    return false;
	                }
	            }
	        }
	        return true;
	    }
	    public static int circulate_func( int n, int divisor_part ){
	         if( n < 10 ) return n; 
	         else return ( n % divisor_part ) * 10 + n / divisor_part; 
	   } 
	  
	}





