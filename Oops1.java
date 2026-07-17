// A blueprint
class Car {
    // attributes
    String color;
    int speed;
    //  methods
    void drive() {
        System.out.println("Car is driving at " + speed + " km/h");
    }
}
class  privateattributesex{
    private String name;
    private int age;
    public privateattributesex(){}
    public privateattributesex(String name, int age){
        this.name=name;
        this.age= age;
    }

    
}
// Creating objects
public class Oops1 {
    public static void main(String[] args) {
        Car myCar = new Car();      // Object created
        myCar.color = "Red";        // Assign values
        myCar.speed = 100;

        myCar.drive(); // Call method
        privateattributesex privatecar = new privateattributesex();
        // privatecar.name ="can" this cant de done
    }

}
