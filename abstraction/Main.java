package abstraction;

public class Main {
    public static void makesamplepay(Payment p1){
        System.out.println("payment is done ...");
    }
    public static void main(String[] args) {
        // Payment pay1 = new CreditCardPayment();
        // Payment pay2 = new UpiPayment();
        // makesamplepay(pay1);
        // makesamplepay(pay2);


        // //  we have not done like this we donw in different way
        // CreditCardPayment c1 = new CreditCardPayment();
        // makesamplepay(c1);
        WhyAbstraction why1 = new WhyAbstractionChildClass();
        why1.pay();


    }
}
