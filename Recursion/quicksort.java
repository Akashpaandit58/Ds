package Recursion;

public class quicksort {
	 public static void main(String[] args) {
		
	
	int ar[]={7,2,1,6,8,5,4};
	int n=ar.length-1;
	quicksort(ar,0,n);
	for(int i=0;i<ar.length;i++)
	{
		System.out.print(ar[i]+" ");
	}
	

}

	private static void quicksort(int[] ar,int start, int end) {
		if(start<end)
		{
			
			//finding the index postion to palce pivot a
			int pindex=partion(ar,start,end);
			//this will run to the left of the subarray
			quicksort(ar,start,pindex-1);
			//this will run till the right of the subarray
			quicksort(ar,pindex+1,end);
			
		}
		
	}

	private static int partion(int[] ar, int start, int end) {
	    
		int pivot=ar[end];
		int pindex=start;
		for(int i=start;i<end;i++)
		{
			if(ar[i]<=pivot)
			{
				int temp=ar[i];
				ar[i]=ar[pindex];
				ar[pindex]=temp;
				pindex++;
				
			}
		}
		
		
		
		int t=ar[pindex];
		ar[pindex]=ar[end];
		ar[end]=t;
		return pindex;
	}
}
