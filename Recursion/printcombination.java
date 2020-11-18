package Recursion;

public class printcombination {
	public static void main(String[] args) {
		int a[]={1,2,3,4,5};
		int n=a.length;
		int r=3;
		int data[]=new int[r];
		printcobination(a,n,r,0,data,0);
		
	}

	private static void printcobination(int[] a, int n, int r, int index, int[] data, int i) {
	if(index==r)
	{
		for(int j=0;j<r;j++)
		{
			System.out.print(data[j]+" ");
			
		}
		System.out.println();
		return ;
	}
	if(i>=n)
	{
		return;
	}
	data[index]=a[i];
		printcobination(a, n, r, index+1, data, i+1);
		printcobination(a, n, r, index, data, i+1);
	}

}
