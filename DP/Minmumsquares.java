package DP;

import java.util.Arrays;

public class Minmumsquares {
	public static void main(String[] args) {
	    int n=41;
	    int dp[]=new int[n+1];
	   Arrays.fill(dp, -1);
	    System.out.println( find(n,dp));
	}

	private static int find(int n, int[] dp) {
		if(n==0)
			return 0;
	
		
		int min=Integer.MAX_VALUE;
	
		for(int i=1;i*i<=n;i++)
		{
			int ans;
			if(dp[n-(i*i)]==-1)
			{
			 ans=find(n-(i*i),dp);
			 dp[n-(i*i)]=ans;
			}
			else   
				ans=dp[n-(i*i)];
				
		   if(min>ans)
		   { min=ans;
		
		}
		   }
		return  min+1;
	}

}
