package Recursion;

public class pairsstar {
public static void main(String[] args) {
	String a="aaaa";
	System.out.println(recursion(a));
}

private static String recursion(String a) {
	if(a.length()==0||a.length()==1)
	{
		return a;
		
	}
	else if(a.charAt(0)==a.charAt(1))
	{
		return a.charAt(0)+"*"+recursion(a.substring(1));
	}
	else
	return a.charAt(0)+recursion(a.substring(1));
	
}
}
