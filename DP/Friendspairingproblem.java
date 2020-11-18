package DP;

import java.util.Arrays;
import java.util.Scanner;

import javafx.scene.transform.Scale;

public class Friendspairingproblem {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=4;
	int dp[]=new int[n+1];
 Arrays.fill(dp, -1);
	System.out.println(frineds(n,dp));
}

private static int frineds(int n, int[] dp) {
	if(n==1)
		return 1;
	if(n==2)
		return dp[n]= 2;
	if(dp[n]!=-1)
		return dp[n];
	
 return dp[n]= frineds(n-1,dp)+(n-1)*frineds(n-2,dp);
}
}
