package Recursion;
import java.util.*;
public class Fibonaccci {
	public static void main(String[] args) {
		Scanner sc=new  Scanner (System.in);
		int n=sc.nextInt();
		 for(int i=0;i<n;i++)
		 {
		 System.out.print(febo(i)+" ");
		 }	
	}
	public static int febo(int n)
	{
		if(n<=1)
			return n;
		
		return febo(n-2)+febo(n-1);
	}
}
