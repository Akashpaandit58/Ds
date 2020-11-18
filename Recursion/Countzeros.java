package Recursion;

import java.util.Scanner;

public class Countzeros {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	System.out.println(find(n));
}

private static int find(int num) {
	if(num == 0) return 1;
    if(num < 10) return 0;
    if(num % 10 == 0) return 1 + find(num / 10);
    else return find(num / 10);
	
}
}
