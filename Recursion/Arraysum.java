package Recursion;

public class Arraysum {
	public static void main(String[] args) {
		int a[]={2,3,4,5};
		System.out.println(sum(a,a.length-1));
		
	}
public static int sum(int a[],int n)
{
	if(n>=0)
	return a[n]+sum(a,n-1);
	else
		return 0;
}

}
