//Question: https://www.hackerrank.com/challenges/java-currency-formatter/problem


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.text.NumberFormat;
import java.util.Locale;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
      
         NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
     

    Locale india = new Locale("en","IN");
    NumberFormat g = NumberFormat.getCurrencyInstance(india);
     
     NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
     
      NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
    
        
        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + g.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}
https://www.hackerrank.com/challenges/java-currency-formatter/problem