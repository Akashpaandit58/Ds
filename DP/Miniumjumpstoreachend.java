package DP;

import java.util.Arrays;

public class Miniumjumpstoreachend {
	public static void main(String[] args) {
		int ar[]={2 ,3 ,1 ,1 ,2 ,4 ,2 ,0 ,1 ,1};
		int dp[]=new int [ar.length];
		Arrays.fill(dp, -1);
		int f=find(ar,ar.length,0,dp);
		if(f==Integer.MAX_VALUE)
		System.out.println(0);
		else
		System.out.println(f);
	
	}

	private static int find(int[] ar, int length, int currpos,int dp[]) {
		if(currpos>=length-1)
		return 0;
		if(dp[currpos]!=-1)
			return dp[currpos];
		int minjump=Integer.MAX_VALUE;
		int maxstep=ar[currpos];
		while(maxstep>0)
		{
			minjump=Math.min(minjump,1+find(ar, length, currpos+maxstep,dp));
			maxstep-=1;
		}
		return dp[currpos]=minjump;
	}

}
