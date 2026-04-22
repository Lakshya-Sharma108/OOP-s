package JavaOopConcept.OopsTask.ThirdTask;

public class Order {
    public static void main(String[] args) {

        placeOrder("Laptop", 1);
        System.out.println("\n");
        placeOrder("Mobile", 3, "10%");

    }


    public static void placeOrder(String name,  int quantity){
        System.out.println("Your order has been placed successfully");
        System.out.println("Order details -- ");
        System.out.println("Product name : "+name);
        System.out.println("Product quantity :"+quantity);
    }

    public static void placeOrder(String name, int quantity, String discount){
        System.out.println("Your order has been placed successfully");
        System.out.println("Order details -- ");
        System.out.println("Product name : "+name);
        System.out.println("Product quantity : "+quantity);
        System.out.println("Discount applied : "+discount);
    }
}
