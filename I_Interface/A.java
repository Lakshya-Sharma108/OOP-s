package JavaOopConcept.I_Interface;


// Diamond problem in Interface :
// when two interfaces have same default method, in that case compiler will confuse which one to override

interface A {
    default void show() {
        System.out.println("A's show");
    }

    // same abstract method of A
    void print();
}

interface B {
    default void show() {
        System.out.println("B's show");
    }

    // same abstract method of B
    void print();
}

class C implements A, B {
    // Compilation Error without override
    @Override
    public void show() {
        // Must resolve the conflict
        A.super.show();// or B.super.show();
        System.out.println("hello ji kya haal chal");
    }


    // Abstract mehtod case - No need to specify - ki kis method ko implement kar rahe hai
    @Override
    public void print(){
        System.out.println("Hello");
    }
}
// Jab 2 interfaces mein same default method ho, to class ko override
// karke specify karna padta hai kaunsa use karna hai.


//TODO -- Java ka rule: If multiple interfaces have the same abstract method signature,
//        the implementing class only needs to provide one method.



class main{
    public static void main(String[] args) {
        C c = new C();
        c.show();
    }
}

