package Interfaces;

public class Main {
    public static void main(String[] args) {
        System.out.println("how does the interfaces work");
        FlyBirds fly1 = new Sparrow();
        fly1.Fly();
        SwimBirds swim1 = new Fish();
        swim1.Swim();

        Duck duck1 = new Duck();
        duck1.Fly();
        duck1.Swim();
    }
}
