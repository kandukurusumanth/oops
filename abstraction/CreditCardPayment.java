package abstraction;

public class CreditCardPayment  extends Payment{
    @Override
    void Pay(){
        System.out.println("Payment is done with the credit card");
    }
}
