package Recursion;
import java.util.*;
public class factorial {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	int n=sc.nextInt();
	System.out.println(fact(n));
	
}

private static int  fact(int n) {
	if(n==1)
		return 1;
	if(n==0)
		return 1;
	
	
	return n*fact(n-1);
}

}
