package JavaOopConcept.C_Constructor;

public class Student {

    int id;
    String name;
    int age;
    int rollNumber;
    long phoneNumber;


    // Default Constructor
    // this constructor sets default values of instance variables
    // based on there datatypes
    Student(){
        this.id = 0;
        this.name = null;
        this.age = 0;
        this.rollNumber = 0;
        this.phoneNumber = 0;
    }


    // Parameterized constructor
    Student(int id, String name, int age, int rollNumber, long phoneNumber){
        this.id = id;
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.phoneNumber = phoneNumber;
    }


    // Copy Constructor
    // this constructor take an object as an argument
    // and copy that objects properties
    Student(Student obj){
        this.id = obj.id;
        this.name = obj.name;
        this.age = obj.age;
        this.rollNumber = obj.rollNumber;
        this.phoneNumber = obj.phoneNumber;
    }

}
