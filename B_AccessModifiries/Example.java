package JavaOopConcept.B_AccessModifiries;

public class Example {
    // Example of different type of access modifiers:

    // Data members with access modifiers ->

    // Default access modifier
    int id = 1;

    // Protected access modifier
    protected String name = "lakshaya";

    // Private access modifier
    private int age = 21;

    // Public access modifier
    public String address = "Rajasthan";




    // Methods with access modifiers ->

    // Default
    void study(){
        System.out.println("Person is studying...");
    }

    // Protected
    protected void sleeep(){
        System.out.println("Person is sleeping...");
    }

    // Private
    private void bath(){
        System.out.println("Person is taking a bath!!!");
    }

    // Public
    public void walk(){
        System.out.println("Person is walking...");
    }
}
