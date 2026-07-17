package  access_modifier;
public class Main {
    public static void main(String[] args) {
        //  public access modifier
        PublicClass  public1 = new PublicClass();
        System.out.println(public1.publicnum);
        PublicClassinherit publicchild1 = new PublicClassinherit();
        System.out.println(publicchild1.publicnum);


        //  private class
        PrivateClass private1 = new PrivateClass();
        // System.out.println(private1.num);


        //  no access modifier 
        NoAccessModifier noaccessmodifier1 = new NoAccessModifier();
        System.out.println(noaccessmodifier1.num);

        //  Proctedted class 
        ProcectedClass procectedClass1 = new ProcectedClass();
        System.out.println(procectedClass1.num);

        ProcectedClassInherit procectedClassInherit1 = new ProcectedClassInherit();
        System.out.println(procectedClassInherit1.num);

    }    
}
