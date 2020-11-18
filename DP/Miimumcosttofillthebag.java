package DP;

import java.util.Arrays;
import java.util.Scanner;

public class Miimumcosttofillthebag {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	int n=sc.nextInt();
	int ar[]=new int [n];
	for(int i=0;i<n;i++)
	{
		ar[i]=sc.nextInt();
	}
	int w=sc.nextInt();
	int dp[]=new int [n+1];
	Arrays.fill(dp,-1);
	int f=find(ar,w,dp);
	System.out.println(f);
}

private static int find(int[] ar, int n,int dp[]) {
	
	 if(n==0)
		 return 0;
	 if(dp[n]!=-1)
		 return dp[n];
	 int min=Integer.MAX_VALUE;
	 for(int i=1;i<=n;i++)
	 {
		 int cost=ar[i-1]+find(ar, n-i,dp);
		 min=Math.min(cost, min);
	 }
	 return dp[n]= min;
}
}
