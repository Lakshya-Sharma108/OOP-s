package JavaOopConcept.A_OppDefinition;

public class BasicOfOops {
    public static void main(String[] args) {
        /*
            Object-Oriented Programming (OOP) Concept :
            OOP is a programming paradigm that is based on the concept of objects. It provides a way to structure
            programs so that properties (data) and behaviors (functions) are bundled together.
            (set of rules jinko follow karke ham software design karte hai)


            What is OOP in Java?
            OOP is a programming model in which programs are designed using objects. It helps in organizing complex
            programs by grouping data (variables) and behaviors (methods) into single units called objects.


            What is Object and Classes :
            Object --> Real world entity which contains its own data members, functions and arguments
            Class --> Blueprint of an object




            What is function and why we use functions ?
            Function is a program which is used to do a particular task. We use function to increase code reusability
            which means we don't need to re-write a program of a particular task, each time, we just make a function of
            it and use it anywhere by calling it

            How to declare a function ?
            A function should always declare outside the main method but inside class
            A functions name and arguments will never be same (ya to name alag hoga ya fir arguments)
            Syntax :
            accessModifier returnType functionName(parameters if needed){
                        --> code <--
            }

            What is function Signature ?
            function signature depends on function/method name and its arguments/parameters
            Example :
            1.
            public void sumOfNum(int a, int b)
            {
            }

            2.
            public void sumOfNum(int a, int b, int c)
            {
            }

            3.
            void sumOfNum(int a, int b)
            {
            }

            In this example function 1 and 2 signature is not same but function 1 and 3 signature is same.

        */

        // To call a function by just give function name with arguments
        sumOfNum();
        sumOfNum(5, 5);
        sumOfNum(10, 5, 25);
        sumOfNum(3, 5, 23, 50);


    }




    public static void sumOfNum()
    {
        System.out.println("Nothing");
    }

    public static void sumOfNum(int a, int b)
    {
        System.out.println(a+b);
    }


    public static void sumOfNum(int a, int b, int c)
    {
        System.out.println(a+b+c);
    }


    static void sumOfNum(int a, int b, int c, int d)
    {
        System.out.println(a+b+c+d);
    }
}
