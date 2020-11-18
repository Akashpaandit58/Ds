package Recursion;
import java.util.*;
public class Bubblesortrecursion {
public static void main(String[] args) {
	int ar[]={5,1,4,2,3};
	bubblesort(ar,ar.length);
	
	System.out.println(Arrays.toString(ar));
}

private static void bubblesort(int[] ar, int n) {
	if(n==1)
		return;
	
	for(int i=0;i<n-1;i++)
	{
		if(ar[i]>ar[i+1])
		{
			int temp=ar[i];
			ar[i]=ar[i+1];
			ar[i+1]=temp;
		}
		
	}
    bubblesort(ar, n-1);
}
}


