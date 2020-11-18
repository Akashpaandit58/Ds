package DP;

import java.util.Scanner;

import javafx.scene.transform.Scale;

public class PallindromPartioning {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		System.out.println(minPalinPartition(s,0,s.length()-1));
		
	}

	public static boolean isPalindrome(String X, int i, int j)
	{
		while (i <= j) {
			if (X.charAt(i++) != X.charAt(j--)) {
				return false;
			}
		}
		return true;
	}

	// Recursive function to find the minimum cuts needed in a String
	// such that each partition is a palindrome
	public static int minPalinPartition(String X, int i, int j)
	{
		// base case: if starting index i and ending index j are equal
		// or X[i..j] is already a palindrome.

		if (i == j || isPalindrome(X, i, j)) {
			return 0;
		}

		// stores minimum number cuts needed to partition X[i..j]
		int min = Integer.MAX_VALUE;

		for (int k = i; k <= j - 1; k++)
		{
			// recur to get minimum cuts required in X[i..k] and X[k+1..j]
			int count = 1 + minPalinPartition(X, i, k) +
						minPalinPartition(X, k + 1, j);

			if (count < min)
				min = count;
		}

		// return the minimum cuts required
		return min;
	}
}