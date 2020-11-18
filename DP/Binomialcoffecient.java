package DP;

import java.util.Scanner;

public class Binomialcoffecient {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int k=sc.nextInt();
	int dp[][]=new int[k+1][n+1];
	for(int i=0;i<dp.length;i++)
	{
		for(int j=0;j<dp[0].length;j++)
		{
			dp[i][j]=-1;
		}
	}
	System.out.println(binomial(n,k,dp));
}

private static int binomial(int n, int k, int[][] dp) {
	if(k==0||k==n)
	{
		return 1;
	}
	if(dp[k][n]!=-1)
	{
		return dp[k][n];
	}
return dp[k][n]=binomial(n-1, k-1, dp)+binomial(n-1, k, dp);
	
}

}
