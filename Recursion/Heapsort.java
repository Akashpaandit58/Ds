package Recursion;

import java.util.Arrays;

public class Heapsort {
	public static void main(String[] args) {
		int ar[]={12,11,13,5,6,7}; 
		int n=ar.length;
		heapsort(ar,n);
		System.out.print(Arrays.toString(ar));
		
		
		}

	private static void heapsort(int[] ar, int n) {
	for(int i=n/2-1;i>=0;i--)
	{
		Maxheapify(ar,n,i);
		
	}
	for (int i=n-1; i>0; i--) 
    { 
        // Move current root to end 
        int temp = ar[0]; 
        ar[0] = ar[i]; 
        ar[i] = temp; 

        // call max heapify on the reduced heap 
        Maxheapify(ar, i, 0); 
    } 

	
	}

	private static void Maxheapify(int[] a, int n, int i) {
		int largest=i;
		int left=2*i+1;
		int right=(2*i)+2;
		
		
		while(left<n&&a[left]>a[largest])
		{
			largest=left;
		}
		while(right<n&&a[right]>a[largest])
		{
			largest=right;
		}
		if(largest!=i)
		{
			int temp=a[largest];
			a[largest]=a[i];
			a[i]=temp;
			
		Maxheapify(a, n, largest);
		}
	}

}
