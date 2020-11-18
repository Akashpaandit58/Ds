package DP;

import java.util.HashMap;
import java.util.Scanner;

public class Besttimetobuystocktwice {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int ar[]={10, 22, 5, 75, 65, 80};
	 HashMap<String, Integer> hm = new HashMap<>();
	int profit=find(ar,0,0,2,hm);
	System.out.println(profit);
	}
	private static int find(int[] ar2, int buyorcell, int i, int K, HashMap<String, Integer> hm) {
		if(i>=ar2.length||K==0)
		return 0;
		   String key = i + "kun" + buyorcell + "aguero" + K;
		   if (hm.containsKey(key)) return hm.get(key);   
		int x=0;
		
		if(buyorcell==0)
		{
			int buy=find(ar2, 1, i+1,K,hm)-ar2[i];
			int skip=find(ar2,0,i+1,K,hm);
			x=Math.max(buy, skip);
		}else
		{
			int sell=find(ar2, 0, i+1,K-1,hm)+ar2[i];
			int nosell=find(ar2,1,i+1,K,hm);
			x=Math.max(sell, nosell);
		}
		hm.put(key, x);
		return x;
	}
}
	


