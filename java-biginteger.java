//Question: https://www.hackerrank.com/challenges/java-biginteger/problem

import java.io.*;
import java.util.*;
import java.math.BigInteger; 

public class Solution {

    public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  String a=sc.next();
  String b=sc.next();
BigInteger b1=new BigInteger(a);
BigInteger b2=new BigInteger(b);
  System.out.println(b1.add(b2));
  System.out.println(b1.multiply(b2));
    }
}
