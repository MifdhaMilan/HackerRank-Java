//Question: https://www.hackerrank.com/challenges/java-negative-subarray/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] A=new int[n];

        for(int i=0;i<A.length;i++){
            A[i]=sc.nextInt();
        }
        int count=0; 
        for(int i=0;i<A.length;i++){
            int sum=0;
        for(int j=i;j<A.length;j++){
            sum=sum+A[j];
            if(sum<0){
            count++;}
        }
        }
        System.out.println(count);
    }
}
