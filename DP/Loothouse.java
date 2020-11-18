package DP;

import java.util.Arrays;
import java.util.Scanner;

public class Loothouse {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int ar[]=new int[n];
	for(int i=0;i<n;i++)
	{
		ar[i]=sc.nextInt();
	}
	int dp[]=new int[n+1];
	Arrays.fill(dp, -1);
	int k=find(ar,n-1,dp);
	System.out.println(k);
}

private static int find(int[] ar, int n, int[] dp) {
     if(n<0)
    	 return 0;
     if(dp[n]!=-1)
     {
    	 return dp[n];
     }
      int  stepcount=ar[n]+find(ar, n-2,dp);
      int skip=find(ar, n-1,dp);
      
      return dp[n]=Math.max(stepcount, skip);
       
     
}
}
