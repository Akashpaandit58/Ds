package DP;

import java.util.Scanner;



public class Equalsumpartition {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int ar[]=new int[n];
	int sum=0;
	for(int i=0;i<n;i++)
	{
		ar[i]=sc.nextInt();
		sum+=ar[i];
	}
    if(equalsum(ar,n,sum)==0)
    {
    	System.out.println("True");
    }
    else
    {
    	System.out.println("False");
    }
}

private static int  equalsum(int[] ar, int n, int sum) {
	boolean dp[][]=new boolean[n+1][(sum/2)+1];
	if(sum%2!=0)
	{
		return 0;
	}
	
	else if(subsets(ar,n,sum/2,dp)==true)
		{
		   return 1;
		} 
	else
		return 0;
		
}

private static boolean subsets(int[] ar, int n, int sum, boolean[][] dp) {
	if(sum==0)
		return true;
	else if(n==0)
		return false;
	else if(dp[n][sum]!=false)
		return dp[n][sum];
	else if(ar[n-1]>sum)
	{
		return subsets(ar, n-1, sum, dp);
	}
	else
		return subsets(ar, n-1, sum-ar[n-1], dp)||subsets(ar, n-1, sum, dp);
	
	
}
}
