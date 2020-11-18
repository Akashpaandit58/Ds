package Recursion;

public class printpattern {
public static void main(String[] args) {
	int n=16;

	boolean flag=true;
	pattern(n,n,flag);
}

private static void pattern(int n, int m,boolean flag) {
	System.out.print(m+" ");
	
	if(flag==false&& n==m)
		return;
	
	
	if(flag)
	{  if(m-5>0)
		pattern(n, m-5, true);
	
	else
		pattern(n, m-5, false);
	
	}
	else
		pattern(n, m+5, false);
}
}
