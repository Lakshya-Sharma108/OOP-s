package JavaOopConcept.OopsTask.SecondTask;

import java.util.Scanner;

public class BankingManagementSystem {
   static BankAccount[] bankAccounts = new BankAccount[200];

    static Scanner input = new Scanner(System.in);
    BankAccount account1;
    public static void main(String[] args) {


        boolean notExit = true;
        while (notExit) {
            System.out.println("Enter your Choice :");
            System.out.println("1. Create Account");
            System.out.println("2. Account Details");
            System.out.println("3. Withdraw");
            System.out.println("4. Deposit");
            System.out.println("5. Exit");
            int choice = input.nextInt();
            input.nextLine();
            switch (choice){
                case 1 :
                     createAcc();
                    break;
                case 2 :
                    break;
                case 3 :
                    break;
                case 4 :
                    break;
                case 5 :
                    System.out.println("exiting...");
                    notExit = false;
                    break;
                default :
                    System.out.println("Enter a valid choice");
                    break;
            }
        }



//        BankAccount ba1 = createAcc();
//        ba1.displayAccDetails();
//        ba1.deposit(300);
//        ba1.displayAccDetails();
//        ba1.withdraw(5000);
//        ba1.displayAccDetails();
//        ba1.withdraw(2800);
//        ba1.displayAccDetails();
//        ba1.withdraw(500);
//        ba1.displayAccDetails();
    }


    public static BankAccount createAcc(){
        System.out.println("Enter your name");
        String name = input.nextLine();
        System.out.println("deposit minimum amount of rs500");
        long miniAmount = input.nextInt();
        input.nextLine();

        return new BankAccount(1234, name, miniAmount);
    }


}
