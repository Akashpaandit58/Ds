package DP;

import java.util.Scanner;

public class BYTLEDIANFGOLDCOIN {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int dp[]=new int[n+1];
		for(int i=0;i<13;i++)
		{
			dp[i]=i;
		}
		for(int i=0;i<=n;i++)
		{
			dp[i]=Math.max(dp[i], dp[i/2]+dp[i/3]+dp[i/4]);
		}
		System.out.println(dp[n]);
		
	}

}
