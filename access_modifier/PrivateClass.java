package access_modifier;
public class PrivateClass {

    //  attributes
    private int num;
    PrivateClass(){
        System.out.println(this.num + "from the construtor");

    }
    PrivateClass(int num){
        
        this.num=num;
    }
    public int getNum(){
        return num;
    }
    
}