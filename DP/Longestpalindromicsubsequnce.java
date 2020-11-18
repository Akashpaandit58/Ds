package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Longestpalindromicsubsequnce {
	 static class FastReader {
	        BufferedReader br;
	        StringTokenizer st;
	 
	        public FastReader() {
	            br = new BufferedReader(new
	                    InputStreamReader(System.in));
	        }
	 
	        String next() {
	            while (st == null || !st.hasMoreElements()) {
	                try {
	                    st = new StringTokenizer(br.readLine());
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            }
	            return st.nextToken();
	        }
	 
	        int nextInt() {
	            return Integer.parseInt(next());
	        }
	 
	        long nextLong() {
	            return Long.parseLong(next());
	        }
	 
	        double nextDouble() {
	            return Double.parseDouble(next());
	        }
	 
	        String nextLine() {
	            String str = "";
	            try {
	                str = br.readLine();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	            return str;
	        }
	    }
public static void main(String[] args) throws NumberFormatException, IOException {
	FastReader sc=new FastReader();
	int testcases=sc.nextInt();
	while(testcases-->0){
	  
 String s1=sc.nextLine();
 StringBuffer s2=new StringBuffer();
  s2=s2.append(s1);
  s2=s2.reverse();
  int dp[][]=new int [s2.length()+1][s2.length()+1];
  for(int i=0;i<dp.length;i++)
	{
		for(int j=0;j<dp[0].length;j++)
		{
			dp[i][j]=-1;
		}
	}
	System.out.println(lcs(s1,s2,s1.length(),s2.length(),dp));
  	
}
}

private static int  lcs(String aa, StringBuffer bb, int a,int b, int[][] dp) {
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

