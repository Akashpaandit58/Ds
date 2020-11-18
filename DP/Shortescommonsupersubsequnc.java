package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Shortescommonsupersubsequnc {
	public static void main (String[] args)throws IOException{
		//code
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int testcases=Integer.parseInt(br.readLine().trim());
		while(testcases-->0){
		
		
		
		String names[]=br.readLine().trim().split("\\s+");
		String s1=br.readLine();
		String s2=br.readLine();
		int dp[][]=new int [s1.length()+1][s2.length()+1];
		for(int i=0;i<dp.length;i++)
		{
			for(int j=0;j<dp[0].length;j++)
			{
				dp[i][j]=-1;
			}
		}
		System.out.println((s1.length()+s2.length()-lcs(s1,s2,s1.length(),s2.length(),dp)));
		}
		}

private static int lcs(String aa,String bb, int a, int b, int[][] dp) {
    if(a==0||b==0)
	return 0;
    if(dp[a][b]!=-1)
    {
    	return dp[a][b];
    }
    else if(aa.charAt(a-1)==bb.charAt(b-1))
    {
    	return dp[a][b]=1+lcs(aa, bb, a-1, b-1, dp);
    }
    else 
    	return dp[a][b]=Math.max(lcs(aa,bb, a-1, b, dp), lcs(aa, bb, a, b-1, dp));
    	
}
}
