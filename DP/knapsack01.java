package DP;

import java.util.Arrays;
import java.util.Scanner;

public class knapsack01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
	    int n=sc.nextInt();
	    int w=sc.nextInt();
	    int  Itemweight[]=new int[n];
	    int price[]=new int[n];
	   
	    for(int i=0;i<n;i++)
	    {
	    	price[i]=sc.nextInt();
	    }
	    for(int i=0;i<n;i++)
	    {
	    	 Itemweight[i]=sc.nextInt();
	    }
	    int dp[][]=new int[n+1][w+1];
	    for(int i=0;i<dp.length;i++)
	    {
	    	for(int j=0;j<dp[0].length;j++)
	    	{
	    		dp[i][j]=-1;
	    	}
	    }
	    int max=knapsack( Itemweight,price,w,n,dp);
		System.out.println(max);

	}
	}
	private static int knapsack(int[] wet, int[] price, int w, int n,int dp[][]) {
		if(n==0||w==0)
		return 0;
		if(dp[n][w]!=-1)
		{
			return dp[n][w];
		}
		else if(wet[n-1]>w)
		{
			
			return dp[n][w]=  knapsack(wet, price, w, n-1,dp);
		}
		else 
		return dp[n][w]=Math.max(price[n-1]+knapsack(wet, price, w-wet[n-1], n-1,dp), knapsack(wet, price, w, n-1,dp));
		

	}

}
