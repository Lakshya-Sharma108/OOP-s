package JavaOopConcept.A_OppDefinition;

public class AccessObject {
    public static void main(String[] args) {

        System.out.println("Inside the AccessObject class");

//        Creating a object of Student class
//        Syntax: ClassName objectName = new Constructor();
        Student s1 = new Student();

//        Giving values to attributes
        s1.id = 1;
        s1.age = 21;
        s1.name = "Lakshaya";

//        Printing those values
        System.out.println("Student id -> "+s1.id);
        System.out.println("Student age -> "+s1.age);
        System.out.println("Student name -> "+s1.name);


//        Calling methods / behaviors using object
        s1.study();
        s1.dance();
        s1.sleep();


    }
}
