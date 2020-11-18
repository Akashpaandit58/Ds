package Recursion;

import java.util.Scanner;

public class multiplication {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int m=sc.nextInt();
	System.out.println(mul(n,m));
}

private static int mul(int n, int m) {
	if(n==0||m==0)
	{
		return 0;
	}
	 int a=n+mul(n,m-1);
	return a;
	
}

}
