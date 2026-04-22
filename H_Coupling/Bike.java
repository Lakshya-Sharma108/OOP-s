package JavaOopConcept.H_Coupling;

    // Tight coupling example

public class Bike{
    Engine engine = new Engine();   // Aggregation -- ek class ke andar dusri class ka object banana
    void drive(){
        engine.start();
        System.out.println("bike is running...");
    }

}



class Engine{
    void start(){
        System.out.println("Engine is starting...");
    }
}
