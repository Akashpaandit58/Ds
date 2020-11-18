package Recursion;

import java.util.HashSet;
import java.util.Set;

public class Happynumber {
	public static void main(String[] args) {
		int a=3;
		System.out.println(happy(a));
	}

	private static int  happy(int a) {
	
		Set<Integer> u= new HashSet<Integer>();
		
		while (u.add(a))
        {
            int value = 0;
            while (a > 0)
            {
                value += Math.pow(a % 10, 2);
                a /= 10;
            }
            a = value;
        }

        return a;
    }

	}


