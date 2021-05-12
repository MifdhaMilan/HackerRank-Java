//Question: https://www.hackerrank.com/challenges/phone-book/problem

//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
        HashMap<String,Integer> hm = new HashMap<String,Integer>();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			in.nextLine();
            hm.put(name,phone);
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
            try{
                int tp=hm.get(s);
                System.out.println(s+"="+tp);
               }catch(Exception e){
                System.out.println("Not found");
            }
            
		}
	}
}



