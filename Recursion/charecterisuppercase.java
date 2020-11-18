package Recursion;import java.util.stream.Collector.Characteristics;

public class charecterisuppercase {
public static void main(String[] args) {
	String s="Akash";
	char a=print(s,0);
	 System.out.println(a); 
}

private static char pri(String s) {
	for(int i=0;i<s.length();i++)
	{
		if(Character.isUpperCase(s.charAt(i)));
		return s.charAt(i);
	}
	
	return 0;
}

//Recursive 
private static char print(String s,int i)
{
	if(s.charAt(i)=='\0')
		return 0;
	if(Character.isUpperCase(s.charAt(i)))
		return s.charAt(i);
 
	
	else
		return print(s,i+1);
}
}

