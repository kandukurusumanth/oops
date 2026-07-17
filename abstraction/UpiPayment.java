package abstraction;

public class UpiPayment extends Payment{
    @Override
    void Pay(){
        System.out.println("payment is done with the help of the upi");
    }
}
