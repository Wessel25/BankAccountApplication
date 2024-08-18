package bankaccountapp;

public class Checking extends Account {

    //List specific properties to Checking account
    int debitCardNumber;
    int debitCardPin;

    //Constructor to initialize checking account properties
    public Checking (String name, String Ssn, double initDeposit){
        super(name, Ssn, initDeposit);
        System.out.println("Checkings Account");

    }


    //List methods specific to checking account
}
