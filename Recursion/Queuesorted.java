package Recursion;
import java.util.*;

public class Queuesorted {
public static void main(String[] args) {
List<Integer>al=Arrays.asList(5, -2, 9, -7, 3);
Queue <Integer>q=new LinkedList<Integer>();
q.addAll(al);

sortqueue(q);
System.out.println(q);
}

private static void sortqueue(Queue<Integer> q) {
	if(q.isEmpty())
	{
		return;
	}
	int top=q.peek();
	q.poll();
	sortqueue(q);
	topqueue(q,top,q.size());
	
	
}

private static void topqueue(Queue<Integer> q, int top,int size) {
	if(q.isEmpty()||size==0)
	{
		q.add(top);
		return;
	}
	else if(top<=q.peek())
	{
		  q.add(top); 
		  
	        // Recursive call for inserting a front 
	        // element of the queue to the last 
	        FrontToLast(q, size); 
	}
	 else 
	    { 
	  
	        // Push front element into 
	        // last in a queue 
	        q.add(q.peek()); 
	        q.remove(); 
	  
	        // Recursive call for pushing 
	        // element in a queue 
	        topqueue(q, top, size - 1); 
	    } 
	 
	
}

private static void FrontToLast(Queue<Integer> q, int size) {
 
{ 
// Base condition 
if (size <= 0) 
return; 

// pop front element and push 
// this last in a queue 
q.add(q.peek()); 
q.remove(); 

// Recursive call for pushing element 
FrontToLast(q,   size - 1); 
} 

}
}
