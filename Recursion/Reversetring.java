package Recursion;

import java.util.Scanner;

public class Reversetring {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	int sl=0;
	int len=s.length()-1;
	 char w[]=s.toCharArray();
	if(reverse(w,sl,len))
	{
		System.out.println("Yes");
	}
	else
	{
		System.out.println("False");
	}
	
}

private static boolean reverse(char []s,int sl,int len) {
  if(sl==len)
	  return true;
  if(sl>len)
	  return true;
  if(s[sl]!=s[len])
  {
	  return false;
  }
  return reverse(s,sl+1,len-1);
	
}
}

