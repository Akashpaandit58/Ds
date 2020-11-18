package DP;

public class Lonegestalternatinsubseaqunce {
	public static void main(String[] args) {
		int ar[]={10,22,9,33,49,50,31,60};
		System.out.println(ar.length); 
		int k= find(ar,0,1,ar.length-1,1);
		int d=find(ar,0,1,ar.length-1,0);
		System.out.println(Math.max(k, d));
	}

	private static int find(int[] ar, int i,int j,int length, int x) {
		if(i==length)
		return 1;
		int maxx1=0;
		if(x == 1){
			if(ar[j] < ar[i]){
				// that means my current is less than my next
				maxx1 = 1 + find(ar, i,i + 1, length, 0);	
			}
		}else{
			if(ar[j] > ar[i]){
				// that means my current is greater than my next
				maxx1 = 1 + find(ar, i, i + 1, length, 1);	
			}
		}

			int max2=find(ar, j,i+1, length,x);
			return  Math.max(max2, maxx1);
	}

}
