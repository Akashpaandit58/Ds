package DP;
import java .util.*;
public class Minimumcandies {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int ar[]=new int [n];
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();;
		}
		int dp[]=new int[n];
		Arrays.fill(dp, 1);
		for(int i=1;i<ar.length;i++)
		{
			if(ar[i]>ar[i-1])
			{
				dp[i]=dp[i-1]+1;
			}
		}
		for(int i=n-1;i>0;i--)
		{
			if(ar[i-1]>ar[i]&&dp[i-1]<=dp[i])
			{
				dp[i-1]=dp[i]+1;
			}
				
		}
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum+=dp[i];
		}
		System.out.println(sum);
	}

}
