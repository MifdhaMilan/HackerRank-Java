//Question: https://www.hackerrank.com/challenges/java-primality-test/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.math.BigInteger;  

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();

        scanner.close();
        BigInteger b1=new BigInteger(n);
        
        if(b1.isProbablePrime(1))
        System.out.println("prime");
        else
        System.out.println("not prime");

    }
}
