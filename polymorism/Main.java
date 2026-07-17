package polymorism;

import access_modifier.NoAccessModifier;
import access_modifier.ProcectedClass;
import access_modifier.PublicClass;

public class Main{
    int num;
    public Main(){
        this.num=-1;
    }
    @Override
    public String toString(){
        return "hi from the to string";
    }
    public static void main(String[] args) {
        // Shape shp1= new Shape();
        // shp1.area();
        Circle cir1 = new Circle();
        cir1.area();


        //  think of the extra case
        Shape cir2 = new Circle();
        cir2.area();
        Main m1 = new Main();
        System.out.println(m1.toString());

        //  understanding access modifer acccess the publicnum here
        PublicClass public1 = new PublicClass();
        System.out.println("this is from the polymorisphm" + public1.publicnum);


        //  understading no access modifier 

        // NoAccessModifier noAccessModifier1 = new NoAccessModifier();
        //  if we take the constructor of the no access modifier in the packages of the access_modifier
        //  then this wont give any error this also the conecpt of the access modifier


        //  Procected Class
        // ProcectedClass procectedClass = new ProcectedClass();
        // System.out.println();


    }
}
