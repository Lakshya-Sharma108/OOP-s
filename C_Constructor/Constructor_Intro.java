package JavaOopConcept.C_Constructor;

public class Constructor_Intro {
    public static void main(String[] args) {
        /*
                                        ---> Constructor <---


           First of all we need to find the answer of two question :

           1. How object actually created ?
           The reason behind object creation is constructor, Constructor is the one who created object and assigning value to instance variables.

           2. What the new keyword actually do ?
           The working of new keyword is calling Constructor and allocating memory to the object.



           Now what is this Constructor ?
           (a) Constructor is a method/special method which is used to Initialize Object.
           (b) It is called automatically when object is created.
           (c) Constructor name always same as Class name.
           Example :
           String name = new String();
             |     |     |      |----------> this is the Constructor of String class
             |     |     |-----------------> this new keyword calling Constructor of String class
             |     |-----------------------> this is classType variable (object) holding constructor call
             |-----------------------------> this is the String class



          In Java there is three (3) types of constructor :
          1. Default/No-argument Constructor
          2. Parameterized Constructor
          3. Copy Constructor



          NOTE:
                 1. We need an object and a constructor, when we want to access
                 another class's non-static properties (variables & methods).

                 2. When we don't have any user define constructor, then only JVM
                 will create and call default constructor which is not visible

        */







//        Default Constructor gives default values of instance
//        variables based on there dataTypes
//        Syntax :
//                   ClassName(){
//
//                   }

        Example e1 = new Example(); // object creation
        // null -- kyoki constructor dataType ke hisab se default value set karta hai
        System.out.println(e1.name+"...."+e1.age+"...."+e1.grade+"...."+ e1.isPass+"...."+ e1.phoneNum);
        // yaha default value override ho gai
        e1.name = "Abhishek";
        e1.age = 24;
        e1.grade = 'a';
        e1.isPass = true;
        e1.phoneNum = 9876543221l;
        System.out.println(e1.name+"...."+e1.age+"...."+e1.grade+"...."+ e1.isPass+"...."+ e1.phoneNum);






//      Now what if we need to create 10 or more objects and assigning values to all of them
//      --> isse to lines of code increase ho jayenge or program speed decrease ho jayegi <--
//
//      In this case we have Parameterized Constructor
//      Syntax :
//                   ClassName(String name, int age){
//                            --code--
//                   }

        // here 7 lines of code completed in just 2 lines
        Example e2 = new Example("lucky", 20, 'b', false, 9997941560L);
        System.out.println(e2.name+"...."+e2.age+"...."+e2.grade+"...."+ e2.isPass+"...."+ e2.phoneNum);






//      Copy Constructor -- in this constructor we give an object as an argument and provide another
//                          objects properties to this (Copy Constructor's) object
//      Syntax :
//                       ClassName( object ){
//                            --> code <--
//                       }

        // A good example of Copy Constructor
        // yaha hamne ek naya object (e3) banake uske constructor me purane object (e2) ko pass kar diya
        // jisse isme purane object ke properties copy ho gayi
        Example e3 = new Example(e2);
        System.out.println(e3.name+"...."+e3.age+"...."+e3.grade+"...."+ e3.isPass+"...."+ e3.phoneNum);
//                                            or
        String str1 = new String("Lakshaya Sharma");
        String str2 = new String(str1);
        System.out.println(str2);


    }
}







class Example{
    String name;
    int age;
    char grade;
    boolean isPass;
    long phoneNum;




    // Default Constructor or No-argument Constructor
    // We don't need to create a Default Constructor
    // this constructor automatically created by JVM when class is created
    Example(){

    }




    // Parameterized Constructor
    Example(String name, int age, char grade, boolean isPass, long phoneNum){
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.isPass = isPass;
        this.phoneNum = phoneNum;
    }




    // Copy Constructor
    // this is the backend working of copy constructor
    Example(Example obj){
        this.name = obj.name;
        this.age = obj.age;
        this.grade = obj.grade;
        this.isPass = obj.isPass;
        this.phoneNum = obj.phoneNum;
    }
}
