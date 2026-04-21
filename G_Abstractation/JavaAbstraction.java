package JavaOopConcept.G_Abstractation;

public class JavaAbstraction {
    public static void main(String[] args) {
      /*
                                      --> Abstraction <--

          What is Abstraction in Java ?
          Abstraction means hiding the complex (unnecessary) implementation and showing only
          the necessary details to the user.
          In Abstraction, we do not provide the complete implementation that's why abstraction
          also called not complete.

          Real-life Example:
          When you drive a car, you only use the steering, brake, and accelerator.
          You don’t need to know how the engine works, how fuel burns, etc.
          That’s abstraction – only showing what is needed, hiding the rest.

          Why Use Abstraction?
          To reduce complexity.
          To improve code readability and reusability.

          1. We use "abstract" keyword to make a class Abstract
          2. Abstract class can contain both methods -- abstract and non-abstract
          3. We can't provide implementation of an abstract method in abstract class
          4. Child class is responsible for abstract class implementation
          5. We can't declare an abstract method in non-abstract class
          6. We can declare a non-abstract method in abstract calss, but we need its implementation
          7. We never create object of abstract class, because abstract class is not complete


          TODO--> We can provide implementation in abstract classes, but we don’t always, because the
                  purpose of abstract methods is to let child classes decide "how" to do something


          Question:
          Can we achieve 100% abstraction with abstract class?
          Yes, we can achieve 0-100% abstraction with abstract class if we will not provide any
          implementation to any method and declare with abstract

     */
    }


///   5. can't declare an abstract method in non-abstract class
//    public abstract void method1();


}
