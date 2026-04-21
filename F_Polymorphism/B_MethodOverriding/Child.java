package JavaOopConcept.F_Polymorphism.B_MethodOverriding;

public class Child extends Parent {

    // Child class method that override Parent class method
    @Override //
    public Double displayMessage(){
        System.out.println("I am a Child class method");
        return 5.5; // Return type Double covariant of Number
    }

    // This is not an override method, it hides parent class method
    public static void hideExample(){
        System.out.println("I am a Child class method hide example");
    }
}


