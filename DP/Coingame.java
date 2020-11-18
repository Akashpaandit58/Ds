package DP;

import java.util.Arrays;

public class Coingame {
	 static int  findWinner(int x, int y, int n) 
	    { 
		 if(n <= 0) {
			 return 0;
			 }
			 if(n==x||n==y||n==1)
				 return 1;
			 
			int a=findWinner(x, y, n-x)^1;
			int b=findWinner(x, y, n-y)^1;
			int c=findWinner(x, y, n-1)^1;
			
			
			return Math.max(a, Math.max(b, c));
	    }
	 
	    public static void main(String args[]) 
	    { 
	        int x =2 , y =4, n = 10; 
	        if (findWinner(x, y, n) ==1) 
	            System.out.println("Beeerus"); 
	        else
	            System.out.println("Whis"); 
	    } 
	} 

