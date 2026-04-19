package JavaOopConcept.B_AccessModifiries;

public class JavaAccessModifiers {
    public static void main(String[] args) {
        /*
            Access Modifiers in Java – Complete Guide
            Access Modifiers in Java control the visibility and accessibility of classes, methods, and variables in different parts of a program. They help in data hiding, encapsulation, and security.

            1. What are Access Modifiers?
            Access Modifiers in Java are keywords that define the scope of a class, method, or variable. They determine who can access them.

            There are four types of access modifiers in Java:
            private -> Only within the same class.
            default (no keyword) -> Accessible within class and in the same package.
            protected -> Accessible within the same package, Class and subclass.
            public -> Accessible from anywhere in the program also outside the package.

        */


        // Creating object of Example calss
        Example person1 = new Example();

        // Accessing data members:

        // 1. Default
        System.out.println(person1.id);  // Accessible
        // 2. Protected
        System.out.println(person1.name);  // Accessible
        // 3. Private
        //System.out.println(person1.age);  // Not Accessible
        // 4. Public
        System.out.println(person1.address);  // Accessible



        // Accessing methods:

        // 1. Default
        person1.study();  //Accessible
        // 2. Protected
        person1.sleeep();  //Accessible
        // 3. Private
        // person1.bath();  //Not-Accessible
        // 4. Public
        person1.walk();  //Accessible
    }
}
