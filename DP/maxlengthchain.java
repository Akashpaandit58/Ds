package DP;

import java.util.*;
import java.util.Scanner;
class Pair
{
	int x;
	int y;
	public Pair(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
}
public class maxlengthchain {

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	Pair pr[]=new Pair[n];
	int ar[]=new int [2*n];
	for(int i=0;i<2*n;i++)
	{
		ar[i]=sc.nextInt();
	}
	for(int i=0,j=0;i<2*n-1&&j<n;i=i+2,j++)
	{
		pr[j]=new Pair(ar[i],ar[i+1]);
	}
	GfG g=new GfG();
	System.out.println(g.maxChainLength(pr,n));
}
}
class GfG
{
	int maxChainLength(Pair arr[], int n)
	{
	// your code here
		 Arrays.sort(arr, new Comparator<Pair>(){
			 public int compare(Pair a, Pair b){
			 return a.x - b.x;
			 }

			 });
	return findMax(arr,n,Integer.MAX_VALUE);

	}

	public int findMax(Pair[] arr, int n, int cur){

	if(n == 0){
	return 0;
	}

	if(cur > arr[n-1].y){
	return Math.max(1 + findMax(arr,n-1,arr[n-1].x), findMax(arr,n-1,cur));
	}else{
	return findMax(arr, n-1, cur);
	}

	}
}
	