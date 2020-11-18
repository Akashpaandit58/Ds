package DP;

import java.util.Arrays;
import java.util.Scanner;

import javafx.scene.transform.Scale;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	     int n=sc.nextInt();
	     
		int dp[]=new int [n+1];
		Arrays.fill(dp, -1);
		
		System.out.println(solve(n,dp));
	
	}

	private static int solve(int n, int[] dp) {
		
		if(n==1)
			return 1;
		if(n==1||n==2)
		{
			dp[n]=1;
		}
		if(dp[n]!=-1)
		{
			return dp[n];
		}
		else
			
			return dp[n]=solve(n-1, dp)+solve(n-2, dp);
	}

}
