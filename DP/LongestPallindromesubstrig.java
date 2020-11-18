package DP;

public class LongestPallindromesubstrig {
	public static String maxString=""; 
	 public static  boolean[][] dp = null;
	public static void main(String[] args) {
		String s="babad";
		 dp = new boolean[s.length()][s.length()];
		String f=longestPalindromRec(s,0,s.length()-1);
		System.out.println(f);
		
	}

	private static String longestPalindromRec(String s, int low, int high) {
		if(low > high) return "";
	    if(dp[low][high]){
	      return s.substring(low, high+1);
	    }
	    if(isPalindrome(s, low, high)){
	      if(maxString.length() < high - low + 1){
	        maxString = s.substring(low, high+1);
	      }
	    }
	    else{
	    longestPalindromRec(s, low+1, high);
	    longestPalindromRec(s, low, high - 1);
	    }
		//mark visited.
	    dp[low][high] = true;
	    return maxString;
	  }

	private static boolean isPalindrome(String s, int low,int high) {
		  while(low < high){
		      if(s.charAt(low) == s.charAt(high)) {
		        low++; high--;
		      }
		      else return false;
		      }
		    return true;
		  }

}
