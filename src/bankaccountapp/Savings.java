package bankaccountapp;

public class Savings extends Account {
    //List specific properties to Savings account
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;

    //Constructor to initialize Savings account properties
    public Savings(String name, String Ssn, double initDeposit){
        super(name, Ssn, initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
    }

    public void setRate(){
        rate = getBaseRate() - .25;

    }

    private void setSafetyDepositBox(){
        safetyDepositBoxID = (int)(Math.random() * Math.pow(10, 3));
        safetyDepositBoxKey = (int)(Math.random() * Math.pow(10, 4));
    }

    //Overriding showInfo to specify the type of account
    public void showInfo(){
        super.showInfo();
        System.out.println(
                "[Your Savings Account features]" +
                        "\nSafety Deposit Box ID: " + safetyDepositBoxID +
                        "\nSafety Deposit Box Key: " + safetyDepositBoxKey
        );
        super.printBalance();
    }


    //List methods specific to Savings account
}
