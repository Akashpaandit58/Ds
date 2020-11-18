package Recursion;

import java.util.Scanner;

public class Fisrtindex {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int ar[]=new int [n];
	for(int i=0;i<n;i++)
	{
		ar[i]=sc.nextInt();
	}
	int x=sc.nextInt();
	int min=-1;
	System.out.println(find(ar,n,x,min));
 
}

private static int find(int[] ar, int n, int x, int min) {
   if(n==0)
   {
	   return min;
   }
   else if(ar[n-1]==x)
   {
	       min=n-1;
	     return min;
   }
   
   return find(ar, n-1, x, min);
	   
	
}
}
