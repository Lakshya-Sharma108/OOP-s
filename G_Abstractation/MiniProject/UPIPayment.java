package JavaOopConcept.G_Abstractation.MiniProject;

abstract class UPIPayment {

    public void enterUpiId(String upiId){
        System.out.println("Enter UPI id "+upiId);
    }

    abstract void processPayment(double amount);

}


class Paytm extends UPIPayment{

    @Override
   void processPayment(double amount){
        System.out.println("Paytm processing your payment of amount : "+amount);
   }
}


class PhonePay extends UPIPayment{

    @Override
    void processPayment(double amount){
        if (amount > 5000){
            System.out.println("can not process payment, please send less then 5000");
            return;
        }
        System.out.println("PhonePay processing your payment of amount : "+amount);
    }
}


class User{
    public static void main(String[] args) {
        UPIPayment ph = new PhonePay();
        ph.enterUpiId("147337@axl");
        ph.processPayment(1000000);

        UPIPayment phy = new Paytm();
        phy.enterUpiId("147337@axl");
        phy.processPayment(100000);
    }
}
