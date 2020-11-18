package DP;

import java.util.Arrays;
import java.util.Scanner;

public class Maxiumpathsum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[][]=new int [n][n];	
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<ar[0].length;j++)
			{
				ar[i][j]=sc.nextInt();
			}
		}
	/*	int m=0;

		for(int  i=0;i<n;i++)
		{
		m=Math.max(m,find(ar,0,i));		
     	}*/
		  System.out.println(MaximumPath(ar, n));
              //System.out.println(m);
	}
	static int MaximumPath(int Mat[][],int N) 
    { 
        int result = 0; 
  
        // creat 2D matrix to store the sum 
        // of the path 
        int dp[][] = new int[N][N + 2]; 
  
        // initialize all dp matrix as '0' 
        for (int[] rows : dp) 
            Arrays.fill(rows, 0); 
  
        // copy all element of first column into 
        // 'dp' first column 
        for (int i = 0; i < N; i++) 
            dp[0][i + 1] = Mat[0][i]; 
  
        for (int i = 1; i < N; i++) 
            for (int j = 1; j <= N; j++) 
                dp[i][j] = Math.max(dp[i - 1][j - 1], 
                                    Math.max(dp[i - 1][j], 
                                    dp[i - 1][j + 1])) + 
                                    Mat[i][j - 1]; 
  
        // Find maximum path sum that end ups 
        // at any column of last row 'N-1' 
        for (int i = 0; i <= N; i++) 
            result = Math.max(result, dp[N - 1][i]); 
  
        // return maximum sum path 
        return result; 
    } 

	private static int find(int[][] ar, int row, int col) {
		if(col<0||col>=ar.length||row>=ar.length) return 0;
		if(row==ar.length-1)
			return ar[row][col];
		return ar[row][col]+Math.max(find(ar, row+1, col-1),Math.max(find(ar, row+1, col+1),find(ar, row+1, col)));
		
			}
}
