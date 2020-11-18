package DP;

import java.util.Scanner;

public class Miniumcostpatj {
	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
		int ar[][]={{1,5,11},{8,13,12},{2,3,7},{15,16,18}};
		int f=find(ar,0,0);
		System.out.println(f);
	}

	private static int find(int[][] ar, int i, int j) {
	  
		if(i==ar.length-1&&j==ar[0].length-1)
			return ar[i][j];
		
		//base Condition
		if(i>=ar.length||j>=ar[0].length)
			return Integer.MAX_VALUE;
		
		int k=find(ar,i+1,j);
		int d=find(ar, i, j+1);
		int e=find(ar, i+1, j+1);
		int min=ar[i][j]+Math.min(k,Math.min(d,e));
		return min;
		
	}

}
