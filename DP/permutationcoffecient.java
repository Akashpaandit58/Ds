package DP;

public class permutationcoffecient {
	public static void main(String[] args) {
		int n=10;
		int k=2;
		int dp[][]=new int[k+1][n+1];
		for(int i=0;i<dp.length;i++)
		{
			for(int j=0;j<dp[0].length;j++)
			{
				dp[i][j]=-1;
			}
		}
	int d=	permutatioCoff(n,k,dp);
	System.out.println(d);
	}

	private static int permutatioCoff(int n, int k, int[][] dp) {
		if(k==0)
		return 1;
		if (k>n)
			return 0;
		if(dp[k][n]!=-1)
		{
			return dp[k][n];
		}
		return dp[k][n]=permutatioCoff(n-1, k, dp)+k*permutatioCoff(n-1, k-1, dp);
	
	}
}
