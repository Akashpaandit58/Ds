package DP;

import java.util.Scanner;

public class Countallsubsequnceofproductlessthank {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int ar[]={4, 8, 7, 2};
	int k=50;
	int dp[][]=new int[ar.length+1][k+1];
	for(int i=0;i<dp.length;i++)
	{
		for(int j=0;j<dp[0].length;j++)
		dp[i][j]=-1;
	}
	
	int d=find(ar,ar.length,k,dp);
	System.out.println(d);
}

private static int find(int[] ar, int n, int k, int[][] dp) {
	if(k==0)
	return 1;
	if(dp[n][k]!=-1)
		return dp[n][k];
	else if(n==0)
		return 0;
	
	else if(ar[n-1]>k)
	{
		return dp[n][k]=find(ar, n-1,k,dp);
	}
	else
		return dp[n][k]=1+find(ar, n-1, k/ar[n-1],dp)+find(ar, n-1,k,dp);
}
}
