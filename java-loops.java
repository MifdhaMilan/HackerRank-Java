//Question: https://www.hackerrank.com/challenges/java-loops/problem

import java.util.*;
import java.io.*;
import java.lang.Math; 

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
             int s=0;
      for(int j=0;j<n;j++){
            s=(int)(a+((Math.pow(2,j))*b))+s;
            a=0;
           System.out.print(s+" ");
      }
      System.out.println();
        }
        in.close();
        
        }

    }
