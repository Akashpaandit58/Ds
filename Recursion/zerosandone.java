package Recursion;

public class zerosandone {
	public static void main(String[] args) {
		
		String s="111000";
		String s1="";
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)!='0'&&s.charAt(i+1)!='1')
				s1+=s;
			
		}
		System.out.println(s1.length()/2);
				
	}

}
