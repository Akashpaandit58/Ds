package Recursion;

public class cheksortedarray {
	public static void main(String[] args) {
		int ar[]={20,30,40,70  ,60};
		if(check(ar,ar.length))
				{System.out.println("yes");
			
				}
		else
		{
			System.out.println("No");
		}
	}

	private static boolean check(int[] ar, int n) {
	   if(n==0||n==1)
	   {
		   return true;
	   }
	   if(ar[n-1]<ar[n-2])
		return false;
	   
	   return check(ar,n-1);
	}
	

}
