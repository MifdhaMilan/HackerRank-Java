//Question: https://www.hackerrank.com/challenges/java-string-tokens/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        // Write your code here.   String s = scan.nextLine();
    String delim="[ .,?!'@_]+";
        String[] arr=s.trim().split(delim);
        int len=arr.length;
        if(s.trim().length()==0){
             System.out.println("0");
        }else if(s.length()>400000){
            return;
        }else{
             System.out.println(len);
             for(int i=0;i<len;i++){
            System.out.println(arr[i]);
        }
        }
        
    
}
       
    }


