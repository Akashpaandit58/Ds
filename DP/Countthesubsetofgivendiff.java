package DP;

import java.util.*;

public class Countthesubsetofgivendiff {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int ar[]=new int[n];
	int sumofarray=0;
	for(int i=0;i<n;i++)
	{
		ar[i]=sc.nextInt();
		 sumofarray+=ar[i];
	}
	int diff=sc.nextInt();
	int sum1=(diff+sumofarray)/2;

	int dp[][]=new int[n+1][sum1+1];
	int k=countsubdiff(ar,n,sum1,dp);
	System.out.println(k);
}

private static int countsubdiff(int[] ar, int n, int sum, int[][] dp) {
	for (int i = 0; i <= n; i++) 
        dp[i][0] = 1; 

    for (int i = 1; i <= sum; i++) 
        dp[0][i] = 0; 
	
    for (int i = 1; i <= n; i++) 
    { 
        for (int j = 1; j <= sum; j++) 
        { 
          
            dp[i][j] = dp[i - 1][j]; 
  
  
            if (ar[i - 1] <= j) 
                dp[i][j] = dp[i - 1][j]+dp[i - 1][j - ar[i - 1]];
        } 
    } 
	return dp[n][sum];
}
}
