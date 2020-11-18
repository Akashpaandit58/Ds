package DP;

import java.util.Scanner;

public class MaximalSquare {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int ar[][]=new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				ar[i][j]=sc.nextInt();
			}
		}	
		System.out.println(find(ar,n,m));
		}

	private static int  find(int[][] ar, int n, int m) {
	if (ar.length==0)
	{
		return 0;
	}
	int max=0;
	int curmax=0;
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<m;j++)
		{
		curmax=	findsquare(ar,i,j);
		max=Math.max(max,curmax);
	}
	}
		return max;
	}

	private static int findsquare(int[][] ar, int i, int j) {
		if(i>=ar.length||j>=ar[0].length||ar[i][j]=='0')
		return 0;
		
		int sum=1+Math.min(findsquare(ar, i+1, j),findsquare(ar, i, j+1));
		return sum;
	}


}
