package JavaOopConcept.F_Polymorphism.B_MethodOverriding;

public class Parent {

    // Parent class method that is override by Child class method or Overridden Method
    public Number displayMessage(){
        System.out.println("I am a parent class method");
        return 5; // Return type id Number
    }


    public static void hideExample(){
        System.out.println("I am a parent class method hide example");
    }
}
