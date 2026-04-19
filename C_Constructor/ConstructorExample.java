package JavaOopConcept.C_Constructor;

public class ConstructorExample {
    public static void main(String[] args) {

        // Creating an object through default/no-argument constructor
        Student s1 = new Student();
        System.out.println("Default values using Default Constructor ---");
        System.out.println(s1.id+"...."+s1.name+"...."+s1.age+"...."+s1.rollNumber+"...."+s1.phoneNumber);
        s1.id = 1;
        s1.name = "Lakshaya";
        s1.age = 20;
        s1.rollNumber = 101;
        s1.phoneNumber = 9997941570l;
        System.out.println("Values after Initializing ---");
        System.out.println(s1.id+"...."+s1.name+"...."+s1.age+"...."+s1.rollNumber+"...."+s1.phoneNumber+"\n");


        // Creating and Initializing an object using Parameterized constructor
        System.out.println("Default values using Parameterized Constructor ---");
        Student s2 = new Student(1, "lakshaya Sharma", 21, 102, 9549157829l );
        System.out.println(s2.id+"...."+s2.name+"...."+s2.age+"...."+s2.rollNumber+"...."+s2.phoneNumber+"\n");


        // Copy Constructor Example
        Student s3 = new Student(s2);
        System.out.println("Default values using Copy Constructor ---");
        System.out.println(s3.id+"...."+s3.name+"...."+s3.age+"...."+s3.rollNumber+"...."+s3.phoneNumber+"\n");

    }
}
