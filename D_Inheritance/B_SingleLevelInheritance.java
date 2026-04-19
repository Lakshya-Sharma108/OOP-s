package JavaOopConcept.D_Inheritance;

public class B_SingleLevelInheritance {
    public static void main(String[] args) {
        /*
            What is Single level Inheritance ?
            Where only a single Child class only inherits/extends a single Parent class.
            This is the simplest form of Inheritance.

            Explaining through diagram :
                                                +----------------------+
                                                |                      |
                                                |     Parent class     |
                                                |                      |
                                                +----------------------+
                                                            ^
                                                            |
                                                            | Extends
                                                            |
                                                +----------------------+
                                                |                      |
                                                |      Child class     |
                                                |                      |
                                                +----------------------+

           In this below example we only inherits a single parent class only through a single child class



           NOTE :- Whenever we make a class, it's always a single level Inheritance but how ?
                   Because in JAVA there is a pre-define class named Object, and this class
                   automatically Inherited by the class we make. (JVM do that)
                   So in a way every class in Java is child class of Object class.
           Some of its important methods :
           .toString()
           .hashCode()
           .getClass()

        */




        SingleLevelChildClass s1 = new SingleLevelChildClass();
        s1.displayMessage();
        s1.DoSomeMath();
    }




    void displayMessage(){
        System.out.println("Hello ji, kya haal chaal");
    }

}





class SingleLevelChildClass extends B_SingleLevelInheritance{
    void DoSomeMath(){
        int a = 15;
        int b = 8;
        int c = a+b;

        System.out.println("sum of a and b is : "+c);
    }
}