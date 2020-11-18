package DP;

import java.util.Scanner;

public class Kanpsacktopdown {
public static void main(String[] args) {
	
	
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0)
	{
    int n=sc.nextInt();
    int w=sc.nextInt();
    int  Itemweight[]=new int[n];
    int price[]=new int[n];
   
    for(int i=0;i<n;i++)
    {
    	price[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++)
    {
    	 Itemweight[i]=sc.nextInt();
    }
     System.out.println(Kanpsacktop(n,w,Itemweight,price));
	
}
}

private static int  Kanpsacktop(int n, int w, int[] itemweight, int[] price) {
	    int dp[][]=new int[n+1][w+1];

	        for(int i=0; i <=n; i++){
	            for(int j=0; j<=w;j=j+1){
	                if(i == 0 || j == 0){
	                    dp[i][j] = 0;
	                }
	            }
	        }

	        for(int i=1;i<=n;i=i+1){
	            for(int j=1;j<=w;j=j+1){
	                if(j - itemweight[i-1] >= 0){
	                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-itemweight[i-1]] + price[i-1]);
	                }else{
	                    dp[i][j] = dp[i-1][j];
	                }
	            }
	        }
	    return dp[n][w];
}
}
