package JavaOopConcept.I_Interface;

public interface InterfaceTopic {
        /*
                                  --> Interface <--

            What is Interface?
            Interface is contract with classes, it does define the functionality that class have to follow.
            But it does not provide implementation.
                                                        or
            An interface is a blueprint for classes. It contains abstract methods that a class must implement.


            Real-Life Analogy :
            Think of an interface like a remote control.
            You press a button → something happens.
            You don’t care how the signal goes or which brand it is—only that it works.
            Similarly, with interfaces
            You define what should be done.
            But the actual work (how) is done by the class that implements it.


            Interface Rules :
            1. We can not create an object of Interface
            2. All the functions in Interface, are public and abstracted by default that's why we do not
               provide implementation of functions/methods inside Interface
            3. Child class is responsible for providing implementation of Interface methods
            4. We can also create default and static methods with implementation in interface (JAVA 8 update)
            5. We do not extend an Interface we do Implement it using "implements" keyword
            6. Interface helps us to achieving multiple inheritance


            1. Default Methods in Interface
            Kya hota hai?
            A default method is a method with a body (implementation) inside an interface.
            It is marked with the default keyword.

            Kyu laaye gaye?
            Taki backward compatibility bani rahe.
            Java ke developers ne socha: agar interface mein ek naya method add kiya jaaye,
            to purani implementing classes break na ho.
            Isliye default methods laaye gaye — taaki hum interface mein method ka body de sakein.

            Syntax:
            interface InterfaceName {
                default void methodName() {
                    // method body
                }
            }



            2. Static Methods in Interface
            Kya hota hai?
            static methods are those that belong to the interface itself,
            not to the implementing class.
            Inko interface name se hi call karna padta hai.

            Syntax:
            interface InterfaceName {
                static void methodName() {
                    // method body
                }
            }



            Summary :
            Interface is like a blueprint for classes.
            All methods are abstract (until Java 8).
            Interface supports multiple inheritance.
            Java 8 allows default and static methods.
            Cannot create object of interface directly.
            Used for loose coupling and polymorphism.

        */


    // by default abstracted
    void method1();

    // default method with implementation
    default void method2(){
        System.out.println("hello ji");
    }

    // static method with implementation
    static void method3(){
        System.out.println("hello world!");
    }
}




class InterfaceExample{
    public static void main(String[] args) {

        InterfaceTopic.method3();
    }
}
