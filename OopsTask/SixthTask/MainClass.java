package JavaOopConcept.OopsTask.SixthTask;

import conditionals.Switch;

import java.util.Scanner;

public class MainClass {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Car car1 = new Car(101, "BMW");
        Car car2 = new Car(102, "Lambo");
        Car car3 = new Car(103, "Alto");

        boolean isOn = true;
        while (isOn){
            System.out.println("Enter your choice \n1. Rent Car \n2. Return Car \n3. Car Details \n4. Exit");
            int choice = input.nextInt();
            input.nextLine();
            switch (choice){
                case 1 :
                    car1.rentCar();
                    break;
                    case 2 :
                        car1.returnCar();
                        break;
                    case 3 :
                        displayCarDetails(car1);
                        break;
                    case 4 :
                        System.out.println("Exiting...");
                        isOn = false;
                        break;
                default :
                    System.out.println("Please Enter a valid choice");
                    break;
            }
        }

    }


    public static void displayCarDetails(Car car){
        if (!car.isRented){
            System.out.println("We don't have car details, because this car is not rented");
            return;
        }else {
            System.out.println(car);
        }
    }
}
