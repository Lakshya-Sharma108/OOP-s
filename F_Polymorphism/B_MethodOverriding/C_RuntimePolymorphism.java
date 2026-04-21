package JavaOopConcept.F_Polymorphism.B_MethodOverriding;

public class C_RuntimePolymorphism {
    public static void main(String[] args) {
    /*
                                        Runtime Polymorphism
                                         (Method Overriding)

            What is Runtime PolyMorphism ?
            Runtime Polymorphism, also known as dynamic method dispatch, is a type of polymorphism
            in which a method call is resolved at runtime rather than at compile time.
            It is achieved in Java using method overriding.

            What is Method Overriding ?
            where a subclass provides a specific implementation of a method
            that is already defined in its superclass.

            Key Points :
            --> ek exact same method in Parent(Super) class and Child(Sub) class
                (both of methods have same signature and same parameter order)
            --> sub class ke overriding method ka return type same ya covariant hona chahiye
                (overriding method of sub class must have same return type or covariant return type)
            --> method overriding same class me nahi kar sakte, iske liye inheritance ki jarurat padti hai
                (we can't do method overriding in same class, need inheritance)
            --> ham static method ko override nahi kar sakte but hide kar sakte hai
                (we can't override a static method, but it can be hide)
            --> We can not reduce the scope of overridden method
                (parent class ka method agar public hai to use sub class me public hi karna padega)


            Why a static method can not be override ?
            Because static method gets memory at compile time and we don't need any object for static method,
            but in Runtime, we need object to Override.

            What is Covariant Return type ?
            When a subclass overrides a method of its superclass, it can return a more specific type
            (a subclass of the original return type) instead of the exact same type.
            (ek tarike se same nasl or prajati ka)

            Superclass Return Type	          Subclass Return Type (Covariant)
            Object	                          String, Integer, List, etc.
            Number	                          Integer, Double, Float
            Collection	                      List, Set, Queue
            List	                          ArrayList, LinkedList
            Set	                              HashSet, TreeSet
            Map	                              HashMap, TreeMap
            Animal (custom)                   Dog, Cat (custom subclasses)
            Shape (custom)	                  Circle, Rectangle, etc.
            InputStream	                      FileInputStream, ByteArrayInputStream
            OutputStream	                  FileOutputStream, PrintStream
            CharSequence	                  String, StringBuilder, StringBuffer
            Throwable	                      Exception, RuntimeException, IOException




            "We use "@overriding" annotation for better understanding of methods,
            this is not mandatory, but it considers as a good practice"




                          TODO -- Important to Understand Runtime Polymorphism

            How a child class create object of parent class ?
            (this process did by JVM internally)
            When we extends a parent class in a child class, that time child class search for a default
            constructor or no-argument constructor in parent class to create its object, if any of one
            found then JVM creates parent class object in child class automatically.

            (this process did by developer)
            But if we have any parameterized or copy constructor then we have to Initialize a parent class
            constructor inside Child class constructor using "super" constructor.

           super() constructor is responsible for parent class object, we use it when in parent class
           we don't have default constructor or no-argument constructor.
    */



        // calling child class function using child class object
        Child c = new Child();
        c.displayMessage();
        // calling parent class function using parent class object
        Parent p = new Parent();
        p.displayMessage();


        /// Good example of Runtime Polymorphism (Method Overriding)
        /// which method is called -- Tricky -- let's understand this
        Parent p2 = new Child();   /// This is called Upcasting or dynamic method dispatch
        p2.displayMessage();
/*
        Parent p2 = new Child();
                    |_________|----------> Child class constructor has the constructor of parent class
                                           this portion of statement is creating parent class object internally,
                                           but how? we see this before, how child class creates object of parent

        This statement creates parent class object and at compile time JVM only check Syntax and syntax wise
        it's correct, but at Runtime it provides child class method that overrides parent class method



        todo -- Is this possible
        Child c1 = new Parent();
                   |___________|-------------> Parent class constructor don't have child class constructor
                                               that's why syntax wise its incorrect and show error at c-time

        this is not possible because parent don't have child class constructor
        child creates parent class object using parent class constructor inside itself
*/



    }


    C_RuntimePolymorphism(String name, int age){

        // this is parent class's parameterized constructor
    }
}





/// Example : Creating a parent class object which has a parameterized constructor
class ChildClass extends C_RuntimePolymorphism{

    // this constructor is for creating parent class object inside child class
    ChildClass(String name, int age){
        super(name, age);
    }

}


