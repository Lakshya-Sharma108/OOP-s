package JavaOopConcept.D_Inheritance;

public class E_InheritancePractice {
    public static void main(String[] args) {
        /*
                                    Interview level questions

           1. What is Object Class ?  list some of its methods
           Object class is Parent class of every class in java, and
           it is automatically extended by JVM.
           Some of its methods :
           .toString()
           .hashCode()
           .getClass()
           .notifyAll()
           .notify()
           .wait()



           2. Scenario :
           We know that in Multiple Inheritance a child class can have multiple parent class and Java not
           support Multiple Inheritance.
           Now let's assume :
           class A{
              --code--
           }

           class B extends A{
              --code--
           }

           class C extends B{
              --code--
           }

           In this case child class "C" has two parents and java not support Multiple Inheritance,
           then why Java support this.

           Answer :
           In Multiple Inheritance a child class can have multiple parent class and Java not
           support Multiple Inheritance.
           but in this case child class "C" only have one parent class that is "B" and "A" is not parent class
           of "C", its grandParent class of "C", that's why java support this.



           3. Why java not support Multiple Inheritance ?
           Answer :
           Because Multiple Inheritance can cause Ambiguity, then what is Ambiguity ?
           Suppose :
           class P1{
                void m1(){
                   print("hii");
                }
           }

           class P2{
                void m1(){
                   print("hello");
                }
           }

           class A extends P1, P2{
                psvm{
                    m1();
                }
           }

           Is case me kya print hoga "hii" ya "hello", because we call a method m1() and both class
           P1 and P2 have same methods, then which method is run.
           In this case java gives an error, that's why Java not support Multiple Inheritance
           Ambiguity is like Confusion, like which method should JVM call




        */
    }
}
