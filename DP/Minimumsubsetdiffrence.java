package DP;
import java.util.*;
public class Minimumsubsetdiffrence {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int ar[]=new int[n];
	int range=0;
	for(int i=0;i<n;i++)
	{
		ar[i]=sc.nextInt();
		range+=ar[i];
	}
	minimumsubsetdiff(ar,range);
	
}

private static void minimumsubsetdiff(int[] ar, int range) {
	boolean dp[][]=new boolean[ar.length+1][range+1];
	int n=ar.length;


	 for (int i = 0; i <= n; i++) 
         dp[i][0] = true; 

     for (int i = 1; i <= range; i++) 
         dp[0][i] = false; 
     for (int i = 1; i <= n; i++) 
     { 
         for (int j = 1; j <= range; j++) 
         { 
             // If i'th element is excluded 
             dp[i][j] = dp[i - 1][j]; 
   
             // If i'th element is included 
             if (ar[i - 1] <= j) 
                 dp[i][j] |= dp[i - 1][j - ar[i - 1]]; 
         } 
     } 
     int diff = Integer.MAX_VALUE; 
     
     // Find the largest j such that dp[n][j] 
     // is true where j loops from sum/2 t0 0 
     for (int j = range / 2; j >= 0; j--) 
     { 
         // Find the  
         if (dp[n][j] == true) 
         { 
             diff = range - 2 * j; 
             break; 
         } 
     } 
	System.out.println(diff);
}
}
