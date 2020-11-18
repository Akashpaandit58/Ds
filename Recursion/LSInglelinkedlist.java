package Recursion;

public class LSInglelinkedlist {
	public static void main(String[] args) {
		single s=new single();
		s.insert(20);
		s.insert(30);
		s.insert(40);
		s.insert(50);
		s.insert(60);
        s.display();
      
        s.display();
        
        
	}

}

class single
{
	Node head;
	public void insert(int data)
	{
		Node node =new Node();
		node.data=data;
		node.next=null;
		if(head==null)
		{
			head=node;
		}
		else 
		{
			Node n=head;
		   while(n.next!=null)
		   {
			   n=n.next;
			   
		   }
		   n.next=node;
		   
		}
	}
	public void display()
	{  
		Node n=head;
	 while(n!=null)
	 {
		 System.out.print(n.data+"-->");
		 n=n.next;
	 }
	 System.out.println("NUll");
		
	}
	
}





class Node
{
	int data;
	Node next;
}