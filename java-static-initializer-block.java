//Question: https://www.hackerrank.com/challenges/java-static-initializer-block/problem


static boolean flag=false;
static Scanner sc=new Scanner(System.in);
static int B=sc.nextInt();
static int H=sc.nextInt();
static{
  
try{
    if(H>0 && B>0)
flag=true;
else 
throw new Exception("Breadth and height must be positive");

}catch(Exception e){
System.out.println(e);
}


}

