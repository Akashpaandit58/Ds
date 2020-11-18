package DP;

public class longestcoomonsubsequnceinthreestring {
public static void main(String[] args) {
	String s="AGGT12";
	String s1= "12TXAYB"; 
	String s2 = "12XBA";
	int n=s.length();
	int m=s1.length();
	int k=s2.length();
	int dp[][][]=new int [n+1][m+1][k+1];
	for(int i=0;i<=n;i++)
	{
		for(int j=0;j<=m;j++)
		{
			for(int g=0;g<=k;g++)
			{
				dp[i][j][g]=-1;
				
			}
		}
	}
	int d=lscofthree(s,s1,s2,n,m,k,dp);
	System.out.println(d);
}

private static int lscofthree(String s, String s1, String s2, int n, int m, int k, int[][][] dp) {
	if(n==0||m==0||k==0)
	return 0;
	if(dp[n][m][k]!=-1)
		return dp[n][m][k];
	else if(s.charAt(n-1)==s1.charAt(m-1)&&s1.charAt(m-1)==s2.charAt(k-1))
		return dp[n][m][k]=1+lscofthree(s, s1, s2, n-1, m-1, k-1,dp);
	else  
		return dp[n][m][k]=Math.max(Math.max(lscofthree(s, s1, s2, n-1, m, k,dp), lscofthree(s, s1, s2, n, m-1, k,dp)), lscofthree(s, s1, s2, n, m, k-1,dp));
}
}
