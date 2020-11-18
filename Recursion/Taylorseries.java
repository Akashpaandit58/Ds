package Recursion;

public class Taylorseries {
	static double  p=1;
	static double f=1;
public static void main(String[] args) {
	System.out.print(taylor(1,5));
}

private static double taylor(int i, int n) {
	
if(n==0)
	return 1;
double r=taylor(i,n-1);
p=p*i;
f=f*n;
return r+p/f;


}
}
