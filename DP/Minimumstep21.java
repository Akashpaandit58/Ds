package DP;

import java.util.Arrays;

public class Minimumstep21 {//normal approach;
	public static void main(String[] args) {
		int n=100000;
		int dp[]=new int[n+1];
		iterative(n,dp);
		Arrays.fill(dp, -1);
		//int k=minim(n,dp);
	
		//System.out.println(k);
}

private static void iterative(int n, int[] dp) {
		dp[0]=0;
		dp[1]=0;
		 int min=0;
		 for(int i=2;i<=n;i++)
		{  
			dp[i]=1+dp[i-1];
			if(i%2==0)
			{
				dp[i]=Math.min(dp[i],1+dp[i/2]);
				
			}
			if(i%3==0)
			{
				dp[i]=Math.min(dp[i],1+dp[i/3]);
			}

		}
	
		 System.out.println(dp[n]);
	}

private static int minim(int n, int[] dp) {

	if(n==1)
		return 0;
	int ans1=Integer.MAX_VALUE;
	if(dp[n-1]==-1)
	{	 ans1=minim(n-1,dp);
		dp[n-1]=ans1;
	}
	else 
	{
		ans1=dp[n-1];
	}
	
	int ans2=Integer.MAX_VALUE;
	if(n%2==0)
	{
	if(dp[n/2]==-1)
	{
		ans2=minim(n/2,dp);
		dp[n/2]=ans2;
	}
	else 
	{
		ans2=dp[n/2];
	}
	}
	
	int ans3=Integer.MAX_VALUE;
	if(n%3==0)
	{
	if(dp[n/3]==-1)
	{
		ans3=minim(n/3,dp);
		dp[n/3]=ans3;
	}
	else 
	{
		ans3=dp[n/3];
	}
	}
	return 1+Math.min(ans1, Math.min(ans2, ans3));
		
		
	
}
}
