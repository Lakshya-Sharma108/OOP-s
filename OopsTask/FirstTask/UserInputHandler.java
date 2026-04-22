package JavaOopConcept.OopsTask.FirstTask;

import java.util.Scanner;

public class UserInputHandler {
    static Scanner input = new Scanner(System.in);
    public static String getUserName(){
        String name = input.nextLine();
        return  name;
    }

    public static int getUserAge(){
        int age = input.nextInt();
        input.nextLine();
        return age;
    }

    public static String getUserAddress(){
        String address = input.nextLine();
        return address;
    }

    public static int getUserChoice(){
        System.out.println("enter Choice : ");
        int choice = input.nextInt();
        input.nextLine();
        return choice;
    }
}
