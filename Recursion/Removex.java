package Recursion;
import java .util.*;
public class Removex {
public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  String a=sc.nextLine();
  char c='x';
  String d="";
  System.out.print(function(a,c,d,a.length()));
}

private static String function(String a, char c, String d, int i) {
	
		
	if(a.length()==0)
		return d;
    String small=function(a.substring(1), c, d, i);
    if(a.charAt(0)==c)
    {
    	return small;
    }
    else 
 
    	return a.charAt(0)+small;
   
}
}
