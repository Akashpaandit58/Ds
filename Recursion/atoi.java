package Recursion;

public class atoi {
public static void main(String[] args) {
	
	String s="123";
	char w[]=s.toCharArray();
     System.out.println(convert(w,s.length()-1));
	
}


public static int convert(char[] S,int n)
{
	if (n < 0 || (S[n] < '0' || S[n] > '9'))
		return 0;
	
	
	return (10*convert(S,n-1)+(S[n]-'0'));

}



}
