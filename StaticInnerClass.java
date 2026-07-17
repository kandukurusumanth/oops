public class StaticInnerClass {
    
    public static void main(String[] args) {
        Sample.main();
    }
}
class Sample{
    public static void hi(){
        System.out.println("hi from the hi function");
    }
    public static void main() {
        System.out.println("from the another class sample");
    }
}
