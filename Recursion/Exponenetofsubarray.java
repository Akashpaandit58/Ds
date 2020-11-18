package Recursion;

public class Exponenetofsubarray {
public static void main(String[] args) {
	int n=2;
	int p=5;
	System.out.println(expo(n,p));
	
}
public static int expo(int n,int p)
{ 
	
	if(p<=0)
		return 1;
	
	
	
	return n*expo(n,p-1);
}
}
