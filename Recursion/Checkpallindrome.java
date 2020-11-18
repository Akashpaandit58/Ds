package Recursion;

import java.util.Scanner;

public class Checkpallindrome {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String p=Checkpall(s);
	System.out.println(p);
	if(s.equals(p))
	{
		System.out.println(true);
	}
	else
	{
		System.out.println(false);
	}
	
}

private static String Checkpall(String s) {
    if (s.isEmpty())
        return s;
    //Calling Function Recursively
    return Checkpall(s.substring(1)) + s.charAt(0);



}
}
