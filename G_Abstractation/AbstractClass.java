package JavaOopConcept.G_Abstractation;

// 1. We use "abstract" keyword to make a class Abstract
public abstract class AbstractClass {
    public static void main(String[] args) {

        // 7. We never create object of abstract class, because abstract class is not complete
        // AbstractClass variable = new AbstractClass();  -- but we create object through child class
        AbstractClass variable = new ChildAbstract();
        variable.method1();
        variable.method2();

/*      How Data hiding works in abstraction?
        Suppose a hacker want to hack our program, in this case hacker access "variable" but the type of
        variable is "AbstractClass" and in AbstractClass there is no implementation of any method and
        the hacker get nothing, because data is hidden in Child Class.
*/


    }



    // 2. Abstract class can contain both methods -- abstract and non-abstract

    // 3. Abstract method -- we can't provide implementation of an abstract method
    abstract void method1();

    // 6. non-abstract method -- need implementation
    void method2(){
        System.out.println("hello world!");
    }
}




class ChildAbstract extends AbstractClass{
    // now we have to provide implementation of abstract method

    @Override
    void method1() {
        //4. Child class is responsible for abstract class implementation
        System.out.println("hii, how are you");
    }
}
