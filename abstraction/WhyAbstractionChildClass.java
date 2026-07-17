package abstraction;

public class WhyAbstractionChildClass extends WhyAbstraction {
   @Override
   void pay(){
    System.out.println("this is from the child class");
   }

//     if you remove it then it will cause an error beacuse abstract gurante the behaviour the behaviour is the pay 
// and that is what the polymorisphm
    
}
