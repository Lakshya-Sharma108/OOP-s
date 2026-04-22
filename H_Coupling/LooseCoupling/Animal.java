package JavaOopConcept.H_Coupling.LooseCoupling;

/*
Here, Zoo class doesn’t care which animal it is. It just knows it’s some Animal.
That’s loose coupling – clean and flexible!
*/

interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Bark");
    }
}

class Zoo {
    void makeSound(Animal a) {
        a.sound(); // Works with Dog, Cat, etc.
    }
}

