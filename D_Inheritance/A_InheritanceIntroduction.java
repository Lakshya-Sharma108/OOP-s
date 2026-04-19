package JavaOopConcept.D_Inheritance;

public class A_InheritanceIntroduction {
    public static void main(String[] args) {
        /*
                       Inheritance (विरासत, उत्तराधिकार) -- also called "Is a relationship"
                                         fundamental concept of OOP's

            What is Inheritance ?
            A Child class Acquires the properties of Parent class through inheritance.
            Concept of Inheritance is best for code Reusability.

            (a). Parent Class -- The class who's properties are inherited
                                 jis class ki properties inherit hoti hai
            (b). Child Class  -- The class who inherit the properties
                                 jo class properties inherit karti hai


            Advantage of Inheritance :
            Code Reusability --
            Inheritance se hum existing code ko reuse kar sakte hain, jisse code baar-baar
            likhne ki zarurat nahi padti.
            Method Overriding (Runtime Polymorphism) --
            Subclass parent class ke method ko apne hisaab se override kar sakti hai, jisse
            run-time par sahi method call hota hai.
            Improved Code Structure --
            Classes ka structure achha aur organized rehta hai, inheritance se code modular banta hai.
            Extensibility --
            Existing code ko easily extend ya upgrade kiya ja sakta hai naye features add karne ke liye.
            Faster Development --
            Pehle se likha hua aur tested code use karne se development mein samay ki bachat hoti hai.
            IS-A Relationship Implementation --
            Inheritance se natural class relationships (jaise ki "yeh uska type hai") define ki ja sakti
            hain, jo object-oriented programming mein helpful hota hai.


            Types of Inheritance in JAVA :
            1. Single level Inheritance
            2. Multi level Inheritance
            3. Hierarchical Inheritance

            Types of Inheritance that Java doesn't support :
            4. Multiple Inheritance
            5. Hybrid Inheritance

        */



        // here you can see we are able to access Parent class properties in Child class
        Dog d1 = new Dog();
        d1.eat();
        d1.bark();

        Cat c1 = new Cat();
        c1.eat();
        c1.meow();


        // Remember we can't call a child class method using parent class object
        Animal a1 = new Animal();
//      a1.bark();
//      a1.meow();
    }
}




///                                 Example of Inheritance

class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
}


// here we can see a common method in all classes --> eat(), isliye ham is method ko sirf ek hi class (Animal) me
// rakhenge or us class ki properties baki classes me inherit kar denge using "extends" keyword, then we are able
// to access Parent class properties in Child class


class Dog extends Animal {
//    void eat(){
//        System.out.println("Animal is eating");
//    }

    void bark(){
        System.out.println("Dog is Barking");
    }
}


class Cat extends Animal {
//    void eat(){
//        System.out.println("Animal is eating");
//    }

    void meow(){
        System.out.println("Cat is  is Meowing");
    }
}
