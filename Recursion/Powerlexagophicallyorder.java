package Recursion;

import java.util.Arrays;

public class Powerlexagophicallyorder {
public static void main(String[] args) {
	String s="abc";
	powerset(s);
}
static void powerset(String s)
{
	char arr[]=s.toCharArray();
	Arrays.sort(arr);
	permute(new String(arr),s.length(),-1,"");
}
static void permute(String str,int n ,int index,String curr)
{
	if(index==n)
	{
		return;
	}
	System.out.println(curr); 
	for (int i = index + 1; i < n; i++) { 
		  
        curr += str.charAt(i); 
        permute(str, n, i, curr); 

        // backtracking 
        curr = curr.substring(0, curr.length() - 1); 
    } 
    return; 
}
}
