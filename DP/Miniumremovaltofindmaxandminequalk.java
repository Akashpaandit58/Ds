package DP;
import java.util.*;
public class Miniumremovaltofindmaxandminequalk {
public static void main(String[] args) {
	int ar[]={1, 5, 6, 2, 8} ;
	int k=2;
	Arrays.sort(ar);
	int dp[][]=new int[ar.length+1][ar.length+1];
	for(int i=0;i<ar.length;i++)
		for(int j=0;j<dp[0].length;j++)
			dp[i][j]=-1;
	int f=maxminremoval(ar,0,ar.length-1,k,dp);
	System.out.println(f);
	
}

private static int maxminremoval(int[] ar, int i, int j, int k,int dp[][]) {
	 if (i >= j) 
         return 0;
	 if(dp[i][j]!=-1)
		 return dp[i][j];
	else if(ar[j]-ar[i]<=k)
		return 0;
	else 
		return dp[i][j]=1+Math.min(maxminremoval(ar, i+1, j, k,dp),maxminremoval(ar, i, j-1, k,dp));
	
}
}
