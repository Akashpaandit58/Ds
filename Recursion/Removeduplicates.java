package Recursion;

import java.util.Scanner;

import com.sun.org.apache.xpath.internal.functions.Function;

public class Removeduplicates {
	 public static void main(String[] args) {
		
	
	 Scanner sc=new Scanner(System.in);
	  String a=sc.nextLine();  
    System.out.println(function(a));	 
}

	private static String function(String a) {
		if(a.length()<=1)
          return a;
           if(a.charAt(0)==a.charAt(1))
           {
        	   return function(a.substring(1));
        	 
           }
           else
           {

        	   String small=function(a.substring(1));
        	     return a.charAt(0)+small;
           }
		
	}
	 
}
