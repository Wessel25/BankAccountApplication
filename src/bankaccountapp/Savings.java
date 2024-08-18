package bankaccountapp;

public class Savings extends Account {
    //List specific properties to Savings account
    int safetyDepositBoxID;
    int getSafetyDepositBoxKey;

    //Constructor to initialize Savings account properties
    public Savings(String name, String Ssn, double initDeposit){
        super(name, Ssn, initDeposit);
        System.out.println("Savings Account");

    }


    //List methods specific to Savings account
}
