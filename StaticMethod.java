public class StaticMethod {
    static int age=1;
    static String name="sumanth";
    public StaticMethod(){
        System.out.println("this is the main constructor");
    }

    public static void main(String[] args) {
    //    System.out.println("this is from an examplary static fucntion",this.name,this.age);
        // System.out.println(Human.age);
        // System.out.println(age);
        // System.out.println(yetanohter());
        // System.out.println(yetanohter());
        Observerdefault sm1 = new Observerdefault();
        sm1.printhi();
        Human.smstatic();

    }
    public static String yetanohter(){
        return name;
    }
}
class Human{
    String name;
    static int age;
    public Human(String name,int age) {
        System.out.println("this is inside the params constructor");
        this.name = name;
        this.age=age;
        
    }

    public Human() {
        System.out.println("this is inside the human constructor");
        
    }
    public static void smstatic(){
        
        System.out.println("hi from smatic");
    }
    public String anstatic(){
        return "hi from another static" + Human.age;
    }
    


}
class Observerdefault{
    static int age;
    public Observerdefault(){
        
        
    }
    public void printhi(){
        System.out.println("printing hi from the observe default" + Observerdefault.age);
    }
    public static void smapledefaultmethod(){
        

    }
}
/*
 * class main{
 *  psvm(){
 *  staticmethod.main();
 * }
 * }
 */