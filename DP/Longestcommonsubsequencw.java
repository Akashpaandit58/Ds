package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Longestcommonsubsequencw {
	public static int lcs(String str) 
    { 
        int n = str.length(); 
   
        // Create and initialize DP table 
        int[][] dp = new int[n+1][n+1]; 
   
        // Fill dp table (similar to LCS loops) 
        for (int i=1; i<=n; i++) 
        { 
            for (int j=1; j<=n; j++) 
            { 
                // If characters match and indexes are not same 
                if (str.charAt(i-1) == str.charAt(j-1) && i!=j) 
                    dp[i][j] =  1 + dp[i-1][j-1];           
                        
                // If characters do not match 
                else
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]); 
            } 
        } 
        return dp[n][n]; 
    } 
	  
	    
	  
	    public static void main(String[] args) 
	    { 	Scanner sc=new Scanner (System.in);
	    	int k=sc.nextInt();
	    
	    	while(k-->0)
	    	{
	    		int l=sc.nextInt();	
	    			sc.nextLine();
	        String s1 = sc.nextLine();
	       
	  
	        System.out.println(lcs(s1)); 
	    }
	    }
	} 