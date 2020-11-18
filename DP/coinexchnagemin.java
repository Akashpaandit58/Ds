package DP;

import java.util.Scanner;

public class coinexchnagemin {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int ar[]=new int[n];
	for(int i=0;i<n;i++)
	{
		ar[i]=sc.nextInt();
	}
	int sum=sc.nextInt();
	int dp[][]=new int [n+1][sum+1];
	int k=countsubset(ar,n,sum,dp);
	System.out.println(k);
}

private static int countsubset(int[] ar, int n, int sum, int[][] dp) {
    for(int i=0;i<=sum;i++)
    {
    	dp[0][i]=Integer.MAX_VALUE-1;
    }	
    for (int i = 0; i <= n; i++) 
        dp[i][0] = 0;

	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=sum;j++)
		{
		    
            if (ar[i - 1] <= j) 
                dp[i][j] =Math.min(dp[i - 1][j],dp[i][j - ar[i - 1]]+1);
		
            else
            {
            	   dp[i][j] = dp[i - 1][j]; 
       		    
            }
		}
	}
    if (dp[n][sum] != Integer.MAX_VALUE-1)
    return dp[n][sum];
    return -1;
}
}
