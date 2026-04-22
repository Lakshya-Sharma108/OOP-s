package JavaOopConcept.H_Coupling.TightCoupling;

/*
 If you want to switch from Dog to Cat, you have to change the code of Zoo class. That's bad design.
*/

class Dog {
    void sound() {
        System.out.println("Bark");
    }
}

class Zoo {
    Dog d = new Dog();  // tightly tied to Dog
    void makeSound() {
        d.sound();
    }
}

