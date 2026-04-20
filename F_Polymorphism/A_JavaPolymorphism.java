package JavaOopConcept.F_Polymorphism;

import static java.lang.String.valueOf;

public class A_JavaPolymorphism {
    public static void main(String[] args) {
        /*
                                            POLYMORPHISM

            Polymorphism is made by combining of two words :
            Poly  +  Morphism
             |        |
            Many  -  Form
            It means a thing can have many forms
            (ek hi cheej ke alag-alag prakar)

            Simple definition :
            Ability of object to take many forms

            For example a method, but how?
            two or more same methods will do different tasks --
            void sum(int a, int b){ a+b }  --> this method will do sum of 2 integer
            void sum(float a, int b){ a+b }  --> this method will do sum of float and int
                                            or
            A single "+" operator can do 2 tasks --
            "lakshaya" + "Sharma" --> Concatenation
            100 + 200 --> Addition


           We have two types of Polymorphism :
           1. Compile time Polymorphism -- Method Overloading
           2. Run time polymorphism -- Method Overriding



                      Todo  Important -- Method Signature
           What is method signature ?
           A method signature in Java consists of the method name and parameter list.
           Name and (Number, DataType, and Order of parameters)

           A method signature includes the method name and parameter list & order.
           The return type is NOT part of the method signature.
           Overloaded methods must have different method signatures.
           Overridden methods must have the same method signature.

           It is used to differentiate methods in a class.
           Methods with same Signature will not overload
           Changing order of parameters in method overloading consider as bad practice,
           always try not to change order of parameters


                     TODO ---- Type Casting ----
           In method we can use Implicit Type Casting, which means a small range data-type
           automatically converts or typeCast's into big range data-type

           byte   →   short   →   int   →   long   →   float   →   double
                into        into      into       into        into

        */

        // Method calling of type casting
        typeCast(10, 65);
        typeCast(10, 65f);



        // Overloading Methods call
        sum(5, 6);
        sum(5.5f, 10);
        sum(15, 2.5f);
        sum(20, 20.5f, 30.5d);



//todo  Constructor Overloading is also possible in Polymorphism
        // Overloading Constructor call
        new A_JavaPolymorphism();
        new A_JavaPolymorphism("Tejas");
        new A_JavaPolymorphism("lucky", 18);



    }

///     same methods but different signature

    public static void sum(int a, int b){
        System.out.println("int and int sum : "+a+b);
    }

    public static void sum(float a, int b){
        System.out.println("float and int sum : "+a+b);
    }

    public static void sum(int a, float b){
        System.out.println(" int and float sum : "+a+b);
    }

    public static void sum(int b, float a, double c){
        System.out.println("float and double sum : "+a+b);
    }




    ///                    Type Casting

    public static void typeCast(int a, float b){
        System.out.println(a);
        System.out.println(b);
    }

    public static void typeCast(float a, double b){
        System.out.println(a);
        System.out.println(b);
    }



    A_JavaPolymorphism(){
        System.out.println("i am default constructor");
    }

    A_JavaPolymorphism(String name){
        name = "Lakshaya";
        System.out.println("Name is : "+name);
    }

    A_JavaPolymorphism(String name, int age){
        name = "Lakshaya";
        age = 20;
        System.out.println("Name is : "+name);
        System.out.println("Age is : "+age);
    }

}
