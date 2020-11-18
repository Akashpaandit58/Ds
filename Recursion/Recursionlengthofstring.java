package Recursion;

public class Recursionlengthofstring {
public static void main(String[] args) {
	String s="AKASH";
   System.out.println(reclen(s));
}

private static int reclen(String s) {
	
	  if (s.equals("")) 
          return 0; 
	  else
		  
		  return reclen(s.substring(1)) + 1; 
}
}
