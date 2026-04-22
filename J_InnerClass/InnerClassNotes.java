package JavaOopConcept.J_InnerClass;
/*
                                            INNER CLASS

     TODO --> What is Inner class?
     In Java, an inner class is a class define inside another class. The class that contains
     it is called the outer class. Inner classes help organize code better and can access
     everything inside the outer class—even private members.


    TODO --> Important Concepts:::
    Static vs. Instance:--
    static means it belongs to the class. No need to create an object to use it.
    Non-static (or instance) means it belongs to an object. You need to create an object to use it.

    Scope:--
    Scope means where a variable can be used in your code. If you create a variable inside a method, you can only use it
    in that method. If you create a variable in a class (outside of methods), you can use it anywhere inside that class.

    final and effectively final:--
    final means the value can't change.
    Java 8 and later lets inner classes use local variables if they don't change—this is called effectively final.

    Outer this:--
    Inside an inner class, use OuterClass.this to refer to the outer class.


    TODO --> Types of Inner Class
    1. Non-static Inner Class (Member Inner Class)
    2. Static Nested Class
    3. Local Inner Class
    4. Anonymous Inner Class

*/





//    TODO --> 1. Non-static Inner Class (Member Inner Class)
//    This class is written inside another class without using static. It's tied to an object of the outer class.
class Outer1 {
    private int x = 42;
    class Inner {
        void show() {
            System.out.println("x = " + x); // can use outer class variable
        }
    }
}
//    Outer outer = new Outer();
//    Outer.Inner inner = outer.new Inner();
//    inner.show();
//    You must create an object of the outer class first.
//    Inner classes can access all variables of the outer class—even private ones.
//    Cannot have static methods or variables (except constants).




//    TODO --> 2. Static Nested Class
//    This class is written inside another class with the static keyword. It is not tied to any outer object.
class Outer2 {
    private static int y = 100;
    static class StaticNested {
        void show() {
            System.out.println("y = " + y); // can use static outer variable
        }
    }
}
//    Outer.StaticNested nested = new Outer.StaticNested();
//    nested.show();
//    No need to create an outer class object.
//    Can access only static members of the outer class.
//    Can have static methods and variables.




//    TODO --> 3. Local Inner Class
//    This class is written inside a method of another class.
class Outer3 {
    void display() {
        final int num = 55;
        class LocalInner {
            void show() {
                System.out.println("num = " + num); // can use final or unchanged variable
            }
        }

        // create object of local class inside that method
        LocalInner li = new LocalInner();
        li.show();
    }
}
//    new Outer().display();
//    Only works inside the method where it's defined.
//    Can use outer class variables.
//    Can also use local variables if they don’t change (final or effectively final).




//    4. Anonymous Inner Class
//    This class doesn’t have a name. It's used to quickly create an object with some behavior.

interface Greeting {
    void sayHello();

    // Main method implementation
//    Greeting greet = new Greeting() {
//        public void sayHello() {
//            System.out.println("Hello!");
//        }
//    };
}

//    greet.sayHello();
//    Used when you need a class for just one time.
//    Usually created to extend a class or implement an interface.
//    Can't have constructors.





///    Main Class for creating object
public class InnerClassNotes {
    public static void main(String[] args) {

        // 1. Non-static class object
        Outer1 outer1 = new Outer1();
        Outer1.Inner inner = outer1.new Inner();
        inner.show();


        // 2. Static nested class object
        Outer2.StaticNested staticNested = new Outer2.StaticNested();
        staticNested.show();


        // 3. Local Inner class object
        Outer3 outer3 = new Outer3();
        outer3.display();


        // 4. Anonymous Inner class
        // We need to provide implementation with obj
        Greeting greet = new Greeting() {
            public void sayHello() {
                System.out.println("Hello!");
            }
        };

        greet.sayHello();

    }
}




/*
    TODO --> Trick to Remember
    Imagine a house (outer class) with rooms:
    A regular room (Member Inner Class) needs you to enter the house first.
    A garage (Static Nested Class) can be used without going inside.
    A temporary guest room made for a day (Local Inner Class).
    A pop-up tent outside for one-time use (Anonymous Inner Class).



    TODO --> Pros of Using Inner Classes
    Advantage:	            Description:
    Encapsulation	        Can access private members of the outer class.
    Logical structure	    Keeps code related to a class in one place.
    Reduces namespace       clutter	Inner classes are not visible to unrelated classes.
    Compact code	        Useful for short-term use cases like anonymous inner classes in event handling.
    Improved readability	Especially when inner class is small and clearly related to the outer class.
*/





