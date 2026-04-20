package JavaOopConcept.F_Polymorphism.B_MethodOverloading;

public class B_CompileTimePolymorphism {
    public static void main(String[] args) {
        /*
                                CompileTime Polymorphism
                                  (Method Overloading)

           What is CompileTime ?
           Compile time refers to the things which happens when program compile or the things the Compiler do, for example checking declaration of variables and methods, if declaration or initialization is wrong then compiler gives error before program runs
           Example :
           int a = 10      --  Right
           float b = 'x';  --  Wrong (compile time error)


           What is CompileTime Polymorphism ?
           CompileTime Polymorphism archived thorough Method Overloading

           What is Method Overloading ?
           When multiple methods have the same name but different parameters (number, type, or order).
           or the multiple same methods but with different Signature, then the correct method is chosen
           before the program runs (at compile time).


           Rules of Method Overloading (Point by Point) :
           1. Same method name must be used in the same class.
           2. Parameters must be different — either:
              in number
              or in type
              or in order
           3. Changing only the return type is not allowed.
              Example: Two methods with same parameters but different return types → ❌ Compilation error
           4. Parameter names can be same or different, it doesn’t matter.
           5. Access modifiers (public, private, etc.) can be same or different.
           6. Methods can be static or non-static. You can overload both.
           7. Method overloading is determined at compile time → also called compile-time polymorphism.
           8. Overloading can happen in the same class or in a subclass (via inheritance).


        */
    }
}
