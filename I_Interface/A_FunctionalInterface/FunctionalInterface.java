package JavaOopConcept.I_Interface.A_FunctionalInterface;

@java.lang.FunctionalInterface
public interface FunctionalInterface {
    void method1();

    // only one abstract function allowed when interface have "@FunctionalInterface" annotation
    // void method2();

    // FunctionalInterface can have multiple default methods
    default void message(){
        System.out.println("ram ram ji");
    }

    // FunctionalInterface can have multiple static methods
    static void greet(){
        System.out.println("hello ji");
    }



    /*
                                        Functional Interface

        What is Functional Interface?
        Definition:
        A Functional Interface is an interface that contains only one abstract method.
        It can have multiple default or static methods, but only ONE abstract method.
        --> Functional Interfaces are the foundation of "Lambda Expressions" and Streams API


        todo -- Example of Functional Interface:
        @FunctionalInterface
        interface MyFunctionalInterface {
            void show(); // only one abstract method

            default void greet() {
                System.out.println("Hello from default method!");
            }

            static void sayHi() {
                System.out.println("Hi from static method!");
            }
        }



        Java 8 mein Functional Interface ka importance:
        Functional Interfaces are the foundation of Lambda Expressions and Streams API.
        📌 Java 8 ne introduce kiya:
        @FunctionalInterface annotation
        Lambda Expressions (=>)
        Built-in functional interfaces (Runnable, Comparator, Predicate, etc.)


        Why @FunctionalInterface is used?
        Optional annotation hai — but Java compiler ko force karta hai ki:
        "Iss interface mein sirf ek hi abstract method hona chahiye."


        Interview Style Points:
        "Can a functional interface have default methods?" → ✅ Yes
        "What happens if I add two abstract methods?" → ❌ Compilation error if annotated
        "Can we use lambda without functional interface?" → ❌ No, lambdas require functional interfaces
        "What is SAM?" → Single Abstract Method

    */
}
