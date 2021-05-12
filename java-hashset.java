//Question: https://www.hackerrank.com/challenges/java-hashset/problem



HashSet<String> hs=new HashSet();
for(int a=0;a<t;a++){
hs.add("("+pair_left[a]+","+pair_right[a]+")");
System.out.println(hs.size());
}
