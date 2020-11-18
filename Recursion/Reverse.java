package Recursion;
import java.util.*;
public class Reverse {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int n1=1;//tail recursive
	reverse(n);
	System.out.println();
	reverse(n,n1);

}

private static void reverse(int n, int n1) {
	if(n==0)
	{
		return ;
	}
	else
		System.out.print(n1+" ");
	reverse(n-1, n1+1);
	
}

private static void reverse(int n) {
	if(n==0)
	{
	return ;	
	}
	else
		System.out.print(n+" ");
	reverse(n-1);

	
}


}
