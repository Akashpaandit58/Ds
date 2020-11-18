package Recursion;

public class productoftwonumber {
	public static void main(String[] args) {
		int a=5;
		int b=4;
		System.out.println(prod(a,b));
	}

	private static int prod(int x, int y) {
	 if(x<y)
	 {
		 return prod(y,x);
	 }
	 else if(y!=0)
	 {
		 return x+prod(x,y-1);
	 }
	 else
		 return 0;
	}
	
	

}
