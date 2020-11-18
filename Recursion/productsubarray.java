package Recursion;
import java.util.*;
public class productsubarray {
	// Recursive function to replace each element of the array with product
		// of every other element without using division operator
		public static int findProduct(int[] A, int n, int left, int i)
		{
			if(i==n)
				return 1;
			int curr=A[i];
			int right=findProduct(A,n,left*A[i],i+1);
			
			A[i]=left*right;
			
			
			return curr*right;
			
			
		}

		public static void main(String[] args)
		{
			int[] A = {1,2,3,4,5};

			findProduct(A, A.length, 1, 0);

			// print the modified array
			System.out.println(Arrays.toString(A));
		}
	}