package Recursion;

import java.util.Arrays;

public class oddeven {
	
static	int ar[]={2,3,4,5,6,7,8,9,10};
static int externalodd[]=new int[ar.length];
static int externaleven[]=new int[ar.length];
public static void main(String[] args) {


odd(ar,ar.length-1);
System.out.println("Even no are:="+Arrays.toString(externaleven));
System.out.println("odd no are:="+Arrays.toString(externalodd));
}

private static int odd(int[] ar2, int length) {
	if(length<0)
		return 0;
	if(ar[length]%2!=0)
		externalodd[length]=ar[length];
	if(ar[length]%2==0)
		externaleven[length]=ar[length];
		return odd(ar,length-1);
}
/*
private static  int even(int[] ar, int length) {
	if(length<0)
		return 0;

		return even(ar,length-1);
	
}*/

}
