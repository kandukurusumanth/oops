package Interfaces;

class Duck implements FlyBirds,SwimBirds {
    public void Fly(){
        System.out.println("duck can fly");
    }
    public void Swim(){
        System.out.println("duck can also swim");
    }
}
