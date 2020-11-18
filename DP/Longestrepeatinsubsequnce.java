package DP;

import java.util.Arrays;
import java.util.Scanner;

public class Longestrepeatinsubsequnce {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 String s=sc.nextLine();
	 String s1=s;
	 int a=s.length();
	 int b=s.length();
	 int dp[][]=new int [a+1][b+1];
	 for(int i=0;i<dp.length;i++)
		 for(int j=0;j<dp[0].length;j++)
		 {
			 dp[i][j]=-1;
		 }
	 int k=lcs(s,s1,a,b,dp);
	System.out.println(k);
}
private static int lcs(String aa,String bb, int a, int b, int[][] dp) {
    if(a==0||b==0)
	return 0;
    if(dp[a][b]!=-1)
    {
    	return dp[a][b];
    }
    else if(aa.charAt(a-1)==bb.charAt(b-1)&&a!=b)
    {
    	return dp[a][b]=1+lcs(aa, bb, a-1, b-1, dp);
    }
    else 
    	return dp[a][b]=Math.max(lcs(aa,bb, a-1, b, dp), lcs(aa, bb, a, b-1, dp));
    	
}
}

