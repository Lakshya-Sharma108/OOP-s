package JavaOopConcept.F_Polymorphism.B_MethodOverloading;

public class OverloadingPractice {
    public static void main(String[] args) {
        /*
            Here we use a concept of Polymorphism -- Method Overloading  --
            in which the name of all methods are same but parameter/arguments
            are different -- means the signature of methods are different
        */

        // make some methods to filter a product by product name, product price and
        // price range between min price to max price

        searchProduct("shirt");
        searchProduct(800);
        searchProduct(500, 1200);

    }


    public static void searchProduct(String name){
        System.out.println("Finding product : " + name);
    }

    public static void searchProduct(int price){
        System.out.println("Finding product of the range : " + price);
    }

    public static void searchProduct(int minPrice, int maxPrice){
        System.out.println("Finding product between the range of " + minPrice + " to " + maxPrice);
    }

}
