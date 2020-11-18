package DP;
import java .util.*;
public class Worbreakproblem {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s = "catsanddog";
	List<String> al = Arrays.asList("cats", "dog", "sand", "and", "cat");
	if(find(s,al)==true)
		System.out.println(1);
	else 
		System.out.println(0);

}

private static boolean find(String s,List<String> al) {
	if(al.contains(s)) {
        return true;
    }
				
	for(int i=0;i<s.length();i++) {
		
		String firstString = s.substring(0,i); 	
		
		if(al.contains(firstString) && find(s.substring(i),al)) 
			return true;
		
	}
	
	return false;
}

}
