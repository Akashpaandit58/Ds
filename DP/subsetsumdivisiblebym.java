package DP;

import java.util.Scanner;

import javafx.scene.transform.Scale;

public class subsetsumdivisiblebym {
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int m=sc.nextInt();
	int ar[]=new int[n];
	for(int i=0;i<n;i++)
	{
		ar[i]=sc.nextInt();
	}
	boolean sub=subsetdiv(ar,n-1,m,0);
	System.out.println(sub);
	
	}

	private static boolean subsetdiv(int[] ar, int n, int m, int sum) {
		if(n<=0)
			return false;
		if((sum%m==0)&&sum!=0)
			return true;
	   return subsetdiv(ar, n-1, m, sum+ar[n])||subsetdiv(ar, n-1, m, sum);
	
	   
	   
	}
}
