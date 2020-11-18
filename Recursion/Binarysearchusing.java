package Recursion;

public class Binarysearchusing {
	public static void main(String[] args) {
		int ar[]={ 1,2,3,4,5};
		int f=5;
		System.out.println(binarysearch(ar,0,ar.length-1,f));
		
	}

	private static int  binarysearch(int[] ar, int l, int r, int f) {
		if(r>=l)
		{
		      int mid = l + (r - l) / 2; 
		
		
		if(ar[mid]==f)
			return mid;
	
		if(ar[mid]>=f)
			return binarysearch(ar,l,mid-1,f);
		
		return binarysearch(ar, mid+1, r, f);
	}
	return -1;
}}

