package Recursion;

public class Recursivesequence {
	 
    static int seriesSum(int calculated,  
                         int current,  
                         int N)  
    { 
         int i, cur = 1; 
      
        // checking termination condition 
        if (current == N + 1)  
            return 0; 
      
        // product of terms till current 
        for (i = calculated; i < calculated + current; i++) 
            cur *= i;  
      
        // recursive call for adding  
        // terms next in the series 
        return cur + seriesSum(i, current + 1, N);  
    } 
      
    // Driver Code 
    public static void main(String[] args)  
    { 
        // input number of  
        // terms in the series 
        int N = 3;  
      
        // invoking the method  
        // to calculate the sum 
        System.out.println(seriesSum(1, 1, N));  
    } 
} 