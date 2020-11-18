package DP;

import java.util.Scanner;

import javafx.scene.transform.Scale;

public class Maximumsegement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int k=findmaxsegementcut(n,a,b,c);
		System.out.println(k);
	}

	private static int findmaxsegementcut(int n, int a, int b, int c) {
		if(n==0)
		return 0;
		int  res1=Integer.MIN_VALUE;
		int rest2=Integer.MIN_VALUE;
		int rest3=Integer.MIN_VALUE;
		if(n>=a)
		{
			res1=Math.max(res1,1+findmaxsegementcut(n-a, a, b, c));
		}
		if(n>=b)
		{
			 rest2=Math.max(rest2, 1+findmaxsegementcut(n-b, a, b, c));
			 
		}
		if(n >= c) {
			rest3 =Math.max(rest3, 1+findmaxsegementcut(n-c, a, b, c));
			}
		int d=Math.max(res1, Math.max(rest2, rest3));
		return d;
	}

}
