package JavaOopConcept.D_Inheritance;

public class D_HierarchicalInheritance {
    public static void main(String[] args) {
        /*
            What is Hierarchical Inheritance ?
            In this a parent class can have multiple child classes and these multiple child classes can also have there multiple child class.

            Explain through a diagram :
                                                 Animal (Super Class)
                                                       |
                                       -----------------------------------
                                       |               |                 |
                                      Mammal         Bird             Reptile  --> (First Level of Child Classes)
                                       |               |                 |
                                       |         ----------------        |
                                       |         |              |        |
                                       |       Sparrow      Parrot       |
                                       |                                 |
                                  -----------                     -------------
                                  |         |                     |           |
                                 Cat       Dog                  Snake       Lizards  --> (Second Level of Child Classes)
        */
    }
}



class AnimalTypes{
    void animals(){
        System.out.println("We have different types of animals");
    }
}


class Mammal extends AnimalTypes{
    void mammalAnimals(){
        System.out.println("this is Mammal type animals");
    }
}


class Bird extends AnimalTypes{
    void mammalAnimals(){
        System.out.println("this is Bird type animals");
    }
}


class Reptile extends AnimalTypes{
    void mammalAnimals(){
        System.out.println("this is Reptile type animals");
    }
}




class CatAnimal extends Mammal{
    void cat(){
        System.out.println("hii, this is a cat");
    }
}

class DogAnimal extends Mammal{
    void dog(){
        System.out.println("hii, this is a dog");
    }
}





class Sparrow extends Bird{
    void birdSparrow(){
        System.out.println("hii, this is a bird sparrow");
    }
}

class Parrot extends Bird{
    void birdParrot(){
        System.out.println("hii, this is a bird Parrot");
    }
}





class Snake extends Reptile{
    void reptileSnake(){
        System.out.println("hii, this is reptile snake");
    }
}

class Lizard extends Reptile{
    void reptileLizard(){
        System.out.println("hii, this is reptile Lizard");
    }
}