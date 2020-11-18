package DP;
import java.util.*;
public class EggProblem {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	int egg=sc.nextInt();
	int floor=sc.nextInt();
	int dp[][]=new int [egg+1][floor+1];
	for(int i=0;i<dp.length;i++)
	{
		for(int j=0;j<dp[0].length;j++)
		{
			dp[i][j]=-1;
		}
	}
	int f=findthresold(egg,floor,dp);
	System.out.println(f);
}

private static int findthresold(int egg, int floor,int dp[][]) {
	if(floor==0||floor==1)
	return floor;
	if(egg==1)
		return floor;
	if(dp[egg][floor]!=-1)
		return dp[egg][floor];
	int min=1000000;
	  for(int j=1;j<=floor;j++)
      {
          int temp=1+Math.max( findthresold(egg-1,j-1,dp), findthresold( egg, floor-j,dp));
          min=Math.min(temp,min);
      }
	return dp[egg][floor]=min;
}
}
