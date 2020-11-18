package DP;
import java .util.*;
public class Maxsumpairwithspecificdiff {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int ar[]=new int [n];
	for(int i=0;i<n;i++)
	{
		ar[i]=sc.nextInt();
	}
	Arrays.sort(ar);
	int k=sc.nextInt();
	int dp[]=new int [n];
Arrays.fill(dp,-1);
	int d=find(ar,0,k,dp);
	System.out.println(d);
}

private static int find(int[] ar, int n,int k, int[] dp) {
	if(n+1>=ar.length)
	return 0;
	if(dp[n]!=-1)
		return dp[n];
		int small=0;
	int small2=0;
	if(ar[n+1]-ar[n]<k)
	{
		small=ar[n+1]+ar[n]+find(ar, n+2, k,dp);
	}
	 small2=find(ar,n+1,k,dp);
	return dp[n]=Math.max(small, small2);
}
}
