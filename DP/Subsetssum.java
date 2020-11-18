package DP;

import java.util.Scanner;

public class Subsetssum {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int ar[]=new int[n];
	for(int i=0;i<n;i++)
	{
		ar[i]=sc.nextInt();
	}
	int sum=sc.nextInt();
	boolean dp[][]=new boolean[n+1][sum+1];
	if(subsets(ar,n,sum,dp)==true)
	{
		System.out.println(true);
	}
	else
		System.out.println(false);

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
