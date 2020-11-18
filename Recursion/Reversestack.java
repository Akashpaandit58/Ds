package Recursion;
import java.util.*;

public class Reversestack {
public static void main(String[] args) {
	Scanner sc=new  Scanner(System.in);
	Stack<Integer>s=new Stack<Integer>();
	for(int i=0;i<5;i++)
	{
		s.push(sc.nextInt());
	}

	System.out.println(s);
	reverse(s);
	System.out.print(s);
}

private static void reverse(Stack<Integer> s) {
if(!s.isEmpty())
{
	int x=s.pop();
	reverse(s);
	
	
	
	insertat(s,x);
}

}

private static void insertat(Stack<Integer> s, int x) {
	if(s.isEmpty())
	{
		s.push(x);
		return;
	}
	int y=s.pop();
			insertat(s, x);
	
	
	s.push(y);
	
}
}
