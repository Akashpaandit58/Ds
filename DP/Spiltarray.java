package DP;

import java.util.Scanner;

public class Spiltarray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int[] arr= {1,4,7,4};
	System.out.println(spiltArray(arr));
}

private static boolean spiltArray(int[] arr) {
	
	return find(arr,0,arr.length-1,0,0);
}

private static boolean find(int[] arr, int start, int end, int leftsum, int rightsum) {
	if(start>end)
		return leftsum==rightsum;
		
		if(arr[start]%5==0)
			return find(arr, start+1, end, leftsum+arr[start], rightsum);
	if(arr[start]%3==0)
		return find(arr, start+1, end, leftsum, rightsum+arr[start]);
	else
		
		return find(arr, start+1, end, leftsum, rightsum+arr[start])||find(arr, start+1, end, leftsum+arr[start], rightsum);
}
}
