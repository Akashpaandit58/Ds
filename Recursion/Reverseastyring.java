package Recursion;
import java.util.*;

public class Reverseastyring {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
String s=sc.nextLine();

revrse(s);
}

private static void revrse(String s)
{if ((s==null)||(s.length() <= 1)) 
    System.out.println(s); 
	else
	{
System.out.print(s.charAt(s.length()-1));
revrse(s.substring(0, s.length()-1));
	}
	
}

}
