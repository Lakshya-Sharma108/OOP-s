package JavaOopConcept.OopsTask.SixthTask;

import java.util.Scanner;

public class Car {
    int carId;
    String brand;
    boolean isRented;
    static int totalCarsRented;

//    public Car() {
//        this.carId = -1;
//        this.brand = "Nothing";
//        this.isRented = false;
//    }

    public Car(int carId, String brand) {
        this.carId = carId;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", brand='" + brand + '\'' +
                ", isRented=" + isRented +
                '}';
    }


    public void rentCar(){
        if (isRented){
            System.out.println("This car is already rented");
            return;
        }else {
            System.out.println("Car rented successfully");
            isRented = true;
            totalCarsRented++;
        }
    }


    public void returnCar(){
        if (!isRented){
            System.out.println("We don't have this car");
            return;
        }else {
            System.out.println("Car returned successfully");
            isRented = false;
            totalCarsRented--;
        }
    }


}
