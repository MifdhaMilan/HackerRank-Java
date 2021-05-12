//Question:https://www.hackerrank.com/challenges/java-bigdecimal/problem


int a,j; String temp;

for(a=0;a<n;a++){
    for(j=a+1;j<n;j++){
        BigDecimal b1=new BigDecimal(s[a]);
        BigDecimal b2= new BigDecimal(s[j]);
        if(b1.compareTo(b2)==-1){
         temp=s[a];
         s[a]=s[j];
         s[j]=temp;

        }else if(b1.compareTo(b2)==0){
           continue;
        }

        
    }
}
        


