//Question: https://www.hackerrank.com/challenges/java-anagrams/problem



    static boolean isAnagram(String a, String b) {
       char temp1,temp2; int i,j;
        String c=a.toLowerCase();
        String d=b.toLowerCase();
        char[] e=c.toCharArray();
        char[] f=d.toCharArray();
        for(i=0;i<c.length();i++){
            for(j=i+1;j<c.length();j++){
                if(e[i]>e[j]){
                temp1=e[i];
                e[i]=e[j];
                e[j]=temp1;
                }
            }
        }

        for(i=0;i<d.length();i++){
            for(j=i+1;j<d.length();j++){
                if(f[i]>f[j]){
                temp2=f[i];
                f[i]=f[j];
                f[j]=temp2;
                }
            }
        }
        String g=new String(e);
        String h= new String(f);
       if(g.equals(h))
       return true;
       else return false;
    }

