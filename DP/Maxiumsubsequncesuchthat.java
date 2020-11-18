package DP;

import java.util.*;
public class Maxiumsubsequncesuchthat {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
	    int ar[]={1, 20, 3};
	    int k=find(ar,ar.length,0);
	    System.out.println(k);
	
	}

	private static int find(int[] ar, int length, int i) {
		int sum=0;
		if(i>=length)
		 return 0;
		
		sum=Math.max(ar[i]+find(ar,length,i+3),find(ar,length,i+1));
		return sum;
	}

}
