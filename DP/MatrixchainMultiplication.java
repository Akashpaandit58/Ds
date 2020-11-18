package DP;

import java.util.Scanner;

public class MatrixchainMultiplication {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int ar[]=new int [n];
	for(int i=0;i<n;i++)
	{
		ar[i]=sc.nextInt();
	}
	int dp[][]=new int [n+1][n+1];
	for(int i=0;i<dp.length;i++)
	{
		for(int j=0;j<dp[0].length;j++)
		{
			dp[i][j]=-1;
		}
	}
	System.out.print(mcn(ar,1,n-1,dp));
	
}

private static int  mcn(int[] ar, int i, int j, int[][] dp) {
   if(i>=j)
	   return 0;
  int min=Integer.MAX_VALUE;
  if(dp[i][j]!=-1)
  {
	  return dp[i][j];
  }
  for(int k=i;k<=j-1;k++)
  {
	  int temp=mcn(ar,i,k,dp)+mcn(ar, k+1, j,dp)+ar[i-1]*ar[k]*ar[j];
	  min=Math.min(min, temp);
  }
  return dp[i][j]=min;
  
}

}
