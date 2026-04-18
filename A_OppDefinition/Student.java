package JavaOopConcept.A_OppDefinition;

public class Student {
//    How to create an object in java

//    1. Data members / Attributes
    public int id;
    public int age;
    public String name;

//    Constructor -> sets attribute value
//    Default constructor -> default value => garbage / 0 / null
    public Student() {
        System.out.println("Default constructor is called");
    }


    //    2. Methods / Behavior
    public void study(){
        System.out.println(name+" is studying...");
    }

    public void dance() {
        System.out.println(name+" is dancing...");
    }

    public void sleep() {
        System.out.println(name+" is sleeping...");
    }

    public static void main(String[] args) {

    }
}
