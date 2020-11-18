package Recursion;

public class Sumofdidgit {
public static void main(String[] args) {
	int a=253;
	int k=add(a);
	System.out.println(k);
}

private static int  add(int i) {
	if(i<=0)
	{
		return i;
	}
	else
	{
     return add(i/10)+i%10;
	}
	
}
}
