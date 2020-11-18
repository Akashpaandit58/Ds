package DP;

public class Deaarngements {
public static void main(String[] args) {
	int n=4;
	int f=count_arr(n);
	System.out.println(f);
}

private static int count_arr(int n) {
	if(n==1)
	return 0;
	if(n==2)
		return 1;
	return (n-1)*(count_arr(n-1)+count_arr(n-2));
	
}
}
