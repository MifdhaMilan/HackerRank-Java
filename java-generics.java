//Question: https://www.hackerrank.com/challenges/java-generics/problem



class Printer
{
  static <E> void printArray(E[] inputArray){
for(E element : inputArray) {
         System.out.println(element);
      }
   }
 
}

