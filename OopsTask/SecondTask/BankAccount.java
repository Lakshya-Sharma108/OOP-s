package JavaOopConcept.OopsTask.SecondTask;

import java.util.Scanner;

public class BankAccount {
    static Scanner input = new Scanner(System.in);

    private int accNo;
    private String holderName;
    private long balance;


    BankAccount(){
        System.out.println("No account yet");
    }

    // Parameterized Constructor
    BankAccount(int accNo, String holderName, long balance){
        this.accNo = accNo;
        this.holderName = holderName;
        this.balance = balance;
    }

    public int getAccNo() {
        return accNo;
    }

    public void deposit(){
        System.out.println("enter amount to diposit ");
        int amount = input.nextInt();
        input.nextLine();
        balance += amount;
        System.out.println("Amount "+amount+" deposited to your account");
    }

    public void withdraw(){
        System.out.println("enter amount to withdraw ");
        int amount = input.nextInt();
        input.nextLine();

        if (balance == 0){
            System.out.println("You don't have minimum required balance ");
        } else if (balance < amount) {
            System.out.println("You don't have enough balance to withdraw in your account");
        }else {
            balance -= amount;
            System.out.println("Amount "+amount+" withdraw from your account");
        }
    }

    public void displayAccDetails(){
        System.out.println("account number : "+accNo);
        System.out.println("account holder : "+holderName);
        System.out.println("current balance : "+balance);
    }


}
