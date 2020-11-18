package DP;

import java.util.Scanner;

public class Maxiumsumofincreasingsub {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ar[]= {3,2,1};
		int dp[][]=new int[ar.length][ar.length];
		int k=find(ar,0,-1,dp);
		System.out.println(k);
	}

	private static int find(int[] ar,int  i,int prev,int dp[][]) {
		if(i==ar.length)
	   		return 0;
		
		if(prev!=-1&&dp[prev][i]!=0)
			return dp[prev][i];
		int op1=0;
		if(prev==-1||ar[prev]<ar[i])
		{
			op1+=ar[i]+find(ar,i+1,i,dp);
		}
		
		
	  	int   op2 = find(ar,i+1,prev,dp);
	 
		if(prev!=-1)
		return dp[prev][i]= Math.max(op1,op2);
		return Math.max(op1,op2);
	}

}
