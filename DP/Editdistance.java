package DP;

public class Editdistance {
public static void main(String[] args) {
	
	  String str1 = "sunday"; 
      String str2 = "saturday"; 
      int dp[][]=new int [str1.length()+1][str2.length()+1];
  	for(int i=0;i<dp.length;i++)
	{
		for(int j=0;j<dp[0].length;j++)
		{
			dp[i][j]=-1;
		}
	}
      int k=editDist(str1.length()-1,str2.length()-1,str1,str2,dp);
      System.out.println(k);

}
private static int editDist(int i, int j,String s1 ,String s2,int[][] dp) {
	 if(i<0) return j+1;
	    
	    if(j<0) return i+1;
	    
	    if(dp[i][j] != -1) return dp[i][j]; 
	    
	    if(s1.charAt(i) == s2.charAt(j)) {
	        return dp[i][j] = editDist(i-1, j-1, s1, s2, dp); 
	    }
	    
	    else { // if both are not same; 
	        int left = 1 + editDist(i, j-1, s1, s2, dp);       // insert 
	        int mid = 1 + editDist(i-1, j, s1, s2, dp);       // remove 
	        int right = 1 + editDist(i-1, j-1, s1, s2, dp);  // replace
	        return dp[i][j] =Math.min(left, Math.min(mid,right)); 
	    }
}
}

