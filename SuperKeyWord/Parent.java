package SuperKeyWord;

public class Parent {
    int num=0;
    Parent(){
        System.out.println("this is from the parent constructor");
    }
    public String ParentMethod(){
       return ("this is the method from the parent");
    }
    Parent(int num1, int num2){
        System.out.println("this is construcotr with two variables " + num1 + " " + num2);
    }
}
