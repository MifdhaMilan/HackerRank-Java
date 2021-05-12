//Question: https://www.hackerrank.com/challenges/java-list/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt(); int i;
   List<Integer> li = new ArrayList<Integer>();
    for(i=0;i<n;i++){
        li.add(sc.nextInt());

    }
    int q=sc.nextInt();
    
    for(i=0;i<q;i++){
        String s=sc.next();
        if(s.equals("Insert")){
            int x=sc.nextInt();
        int y=sc.nextInt();
            li.add(x,y);

        }else{
              int d=sc.nextInt();
              li.remove(d);
        }

    }
    for( Integer a:li){
        System.out.print(a+" ");
    }
    }
}
