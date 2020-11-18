package DP;
import java .util.*;
public class Longestsubsequncediffrnce1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int ar[]={10, 9, 4, 5, 4, 8, 6};
	int dp[]=new int [ar.length];
	Arrays.fill(dp,1);
	for(int i=1;i<ar.length;i++)
	{
		for(int j=0;j<i;j++)
		{
			if(Math.abs(ar[i]-ar[j])==1)
			{
				dp[i]=Math.max(dp[i], dp[j]+1);
			}
		}
	}
	 int ans = 1;
     for(int i = 0;i < dp.length;i++)
         ans = Math.max(ans, dp[i]);
     
	System.out.println(ans);	
}

}
