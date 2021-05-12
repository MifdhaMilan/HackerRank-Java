//Question: https://www.hackerrank.com/challenges/java-arraylist/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt(); int i,j;
       ArrayList<ArrayList<Integer>> arr=new ArrayList<ArrayList<Integer>>();
      
       for(i=0;i<n;i++){
           int d=sc.nextInt();
           ArrayList<Integer> ar=new ArrayList<Integer>();
           for(j=0;j<d;j++){
              
           ar.add(sc.nextInt());
           }
           arr.add(ar);
       }
       int q=sc.nextInt();

       for(i=0;i<q;i++){
           
           int x=sc.nextInt();
           int y=sc.nextInt();

           try{
          System.out.println(arr.get(x-1).get(y-1));
           }catch(Exception e){
           
            System.out.println("ERROR!");
           }   
           
           }
       }
      

    }


