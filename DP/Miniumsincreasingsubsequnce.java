package DP;
import java .util.*;
public class Miniumsincreasingsubsequnce {
	public static void main(String[] args) {
		 Scanner sc=new Scanner (System.in);
	       int t =sc.nextInt();
	       while(t-->0)
	       {
	           int l=sc.nextInt();
	           sc.nextLine();
	           String s=sc.nextLine();
	           int count=0;
	           for(int i=0;i<l-1;i++)
	           {
	               if(s.charAt(i)==s.charAt(i+1))
	               {
	               count++;
	               }
	           }
	           System.out.println((int)Math.ceil(count/2.0));
	       }
		}
	}
