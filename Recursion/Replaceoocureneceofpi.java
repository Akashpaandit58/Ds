package Recursion;

public class Replaceoocureneceofpi {
  public static void main(String[] args) {
	String s="pippppi";
	System.out.println(replace(s));
	
}

private static String replace(String s) {
	if(s.length()<=1)
		return s;
	
	
	if(s.charAt(0)=='p'&&s.length()>=2&&s.charAt(1)=='i')
		return "3.14"+replace(s.substring(2,s.length()));

	else
		return s.charAt(0)+replace(s.substring(1, s.length()));

}
}
