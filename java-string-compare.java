//Question: https://www.hackerrank.com/challenges/java-string-compare/problem



    public static String getSmallestAndLargest(String s, int k) {
       
int start=0; int end=k; int i,j; String temp;
int len=s.length();
String[] list=new String[len-k+1];
for(i=0;i<len-k+1;i++){
list[i]=s.substring(start,end);
start+=1;
end+=1;
}
for(i=0;i<len-k+1;i++){
    for(j=i+1;j<len-k+1;j++){
        if(list[i].compareTo(list[j])>0){
              temp=list[i];
              list[i]=list[j];
              list[j]=temp;
        }
    }

}
        return list[0] + "\n" + list[len-k];
    }

