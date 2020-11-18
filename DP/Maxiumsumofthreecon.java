package DP;

public class Maxiumsumofthreecon {
	public static void main(String[] args) {
		  int ar[]={1, 2, 3, 4, 5, 6, 7, 8};
		    int k=find(ar,ar.length);
		    System.out.println(k);
	}

public static int find(int[] ar, int length) {
	   if(length==0)
		return 0;
	   if(length==1)
		   return ar[0];
	   if(length==2)
		   return ar[0]+ar[1];
	   int pos=find(ar, length-1);
	   int pos2=find(ar, length-3)+ar[length-1]+ar[length-2];
	   int pos3=find(ar, length-2)+ar[length-1];
	   
	   
	   return Math.max(pos, Math.max(pos2, pos3));
	}

}
