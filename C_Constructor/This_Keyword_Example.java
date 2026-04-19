package JavaOopConcept.C_Constructor;

public class This_Keyword_Example {
    public static void main(String[] args) {
        /*
        Use of This keyword :
        1. this keyword id used to access same class's non-static properties
           or this keyword always points instance variable of the same class
        2. this keyword refers to current object of that class
    */


///                           That's how "this" keyword works

        // Is case me Constructor method ki values print hongi kyoki constructor method me hamne this nahi lagaya
        AnotherClass obj1 = new AnotherClass("lakshaya", 20, "bharatpur");
        System.out.println(obj1+"\n");

        // Is case me class ki values print hongi kyoki Constructor method me hamne this lagaya hai
        AnotherClass obj2 = new AnotherClass();
        System.out.println(obj2);






///                 Explain -- "this" refers to current object of that class

        // here you can see same constructor used to create all these 3 object
        // but all objects holds different values because of this keyword
        AnotherClass obj3 = new AnotherClass("Graduation", "BCA", 'a');
        AnotherClass obj4 = new AnotherClass("Masters", "M.tech", 'b');
        AnotherClass obj5 = new AnotherClass("Phd", "IT", 'a');


    }
}



class AnotherClass{
    String qualification;
    String course;
    char grade;


    String name = "Tejas";
    int age = 24;
    String address = "Dholpur";



    // 1 Parameterized Constructor
    AnotherClass(String name, int age, String address){
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
    }


    // 2 Parameterized Constructor
    AnotherClass() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.address);
    }


    // 2 Parameterized Constructor
    AnotherClass(String qualification, String course, char grade) {
        this.qualification = qualification;
        this.course = course;
        this.grade = grade;
    }
}
