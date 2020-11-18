package Recursion;

import java.util.Arrays;

public class Insertionsort {
public static void main(String[] args) {
	int ar[]={12,11,13,5,6};
	quicksort(ar,ar.length);
System.out.println(Arrays.toString(ar));
}

private static void printarray(int[] ar) {
	// TODO Auto-generated method stub
	
}

private static void quicksort(int[] ar, int n) {
if(n<=1)
	return;
quicksort(ar, n-1);
int last=ar[n-1];
int j=n-2;
while(j>=0&&ar[j]>last)
{
	ar[j+1]=ar[j];
	j--;
}
ar[j+1]=last;
}
}
