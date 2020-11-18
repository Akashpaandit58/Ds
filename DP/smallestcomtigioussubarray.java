package DP;
import java .util.*;
public class smallestcomtigioussubarray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int ar[]={3, -4, 2, -3, -1, 7, -5};
	int cursum=ar[0];
	int oversum=ar[0];
	for(int i=0;i<ar.length;i++)
	{
		if(cursum>0)
			cursum=ar[i];
		else 
			cursum+=ar[i];
		oversum=Math.min(oversum, cursum);
	}
	System.out.println(oversum);
}
}
