
	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;

	public class  ExceptionHanling{

	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner sc=new Scanner(System.in);        
	    
	    try{
	        int x=sc.nextInt();
	        int y=sc.nextInt();
	      int c=x/y;
	        if (y != 0) {              
	            System.out.println(x/y);
	        }

	    }
	    catch (InputMismatchException e)
	    {
	        System.out.print("java.util.InputMismatchException");
	    }
	    catch(ArithmeticException e)
	    {
	        System.out.println("java.lang.ArithmeticException: / by zero");
	    }

	    }
	}


