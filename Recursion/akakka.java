package Recursion;
import java.util.*;
public class akakka {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
    double n = sc.nextDouble(); 
    System.out.println( 
    	      String.format("%.6f", sumOfSeries(n)));
}
public static double sumOfSeries(double num) 
{ 
    double res = 0, fact = 1; 
    for (int i = 1; i <= num; i++) 
    { 
        fact = fact * i; 

        res = res + (i / fact); 
    } 
    return(res); 
} 
}
