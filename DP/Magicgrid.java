package DP;

import java.util.Arrays;
import java.util.Scanner;

public class Magicgrid {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		int n=sc.nextInt();
		int m=sc.nextInt();
		int ar[][]=new int [n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				ar[i][j]=sc.nextInt();
			}
		}
		int dp[][]=new int[n+1][m+1];
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=m;j++)
			{
				dp[i][j]=-1;
			}
		}
		System.out.println(magicgrid(ar,0,0,ar.length,ar[0].length,dp));
		}
	}

	private static int magicgrid(int[][] ar, int i, int j, int n, int m, int[][] dp) {
		if(dp[i][j]!=-1)
			return dp[i][j];
		if(i==n-1&&j==m-1)
			
			return ar[i][j]>0?1:Math.abs(ar[i][j])+1;
     	if(i==ar.length||j==ar[0].length)
     	{
     	   return Integer.MAX_VALUE;	
     	}
     	
     	return dp[i][j]=Math.max(1,Math.min(magicgrid(ar, i+1, j, n, m,dp), magicgrid(ar, i, j+1, n, m,dp))-ar[i][j]);
     	
	}
}