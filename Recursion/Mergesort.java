package Recursion;

public class Mergesort {
	public static void main(String[] args) {
		int ar[]={2,4,5,1,3,7,6};
		int n=ar.length-1;
		mergersort(ar,0,n);
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		
	}

	private static void mergersort(int[] ar, int low, int high) {
	if(low>=high)
	{
	
		return;
	}
	
	
		 int mid=(low+high)/2;
		 
		 
		 
		 mergersort(ar,low,mid);
		 mergersort(ar,mid+1,high);
		 
		 
		 merge(ar,low,high);
	}

	private static void merge(int[] a, int low, int high) {
		
		
		int mid=(low+high)/2;
		int i=low;
		int j=mid+1;
		int k=low;
		int temp[]=new int[a.length];
		while(i<=mid&&j<=high)
		{
			if(a[i]<a[j])
			{
				temp[k++]=a[i++];
			}
			else
			{
				temp[k++]=a[j++];
			}
		}
		while(i<=mid)
		{
			temp[k++]=a[i++];
		}
		while(j<=high)
		{
			temp[k++]=a[j++];
		}
		
		for(i=low;i<=high;i++)
		{
			a[i]=temp[i];
		}
		
		
		
		
	}

}
