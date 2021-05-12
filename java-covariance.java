//Question: https://www.hackerrank.com/challenges/java-covariance/problem



//Complete the classes below
class Flower{
    String whatsYourName(){
        System.out.println("I have many names and types");
        return new String();
    }
}

class Jasmine extends Flower{
    String whatsYourName(){
        return "Jasmine";
    }
}

class Lily extends Flower{
 String whatsYourName(){
        return "Lily";
    }
}

class Region{
    Flower yourNationalFlower(){
        return new Flower();
    }
}

class WestBengal extends Region{
     Jasmine yourNationalFlower(){
          return new Jasmine();
    }
}

class AndhraPradesh extends Region {
    
    Lily yourNationalFlower(){
       return new Lily();
    }
}

