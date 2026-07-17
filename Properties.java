public class Properties {
    public static void main(String[] args) {
        Children child = new Children();
        child.samenoise();
        Children child2 = new Children("sumanth","good");
        child2.sameeyes();
    }
}
class Parent {
    String Eyes;
    String Nose;
    int Properties;
    String Name;
    Parent(){
        
    }
    public Parent(String Name){
        this.Name=Name;

    }
    public Parent(String eyes, String nose, int properties, String name) {
        this.Eyes = eyes;
        this.Nose = nose;
        this.Properties = properties;
        this.Name = name;
    }
    public String samenoise(){
        return "you have same noise";
    }
    public String sameeyes(){
        return "you have the same noise";
    }
    public String givingproperties(){
        return "you have got the properties";
    }
}
class Children extends Parent{
    String face;
    public Children(){

    }
    public Children(String name,String face){
        super(name);
        this.face=face;
    }

}