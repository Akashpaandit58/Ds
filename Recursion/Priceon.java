package Recursion;
import java.util.*;
public class Priceon {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	int testcase=sc.nextInt();
	while(testcase-->0)
	{
		int N=sc.nextInt();
		int K=sc.nextInt();
		int ar[]=new int[N];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
			
		}
		int revenuebefore=0;
		for(int i=0;i<ar.length;i++)
		{
			revenuebefore+=ar[i];
		}
	
		int newrev[]=new int[N];
		for(int i=0;i<newrev.length;i++)
		{
			if(ar[i]>K)
			{
				newrev[i]=K;
			}
			else
			{
				newrev[i]=ar[i];
			}
		}
		int revafter=0;
		for(int i=0;i<newrev.length;i++)
		{
			revafter+=newrev[i];
		}
		System.out.println((revenuebefore-revafter));
		
	}
}
}
