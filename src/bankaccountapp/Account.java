package bankaccountapp;

import javax.net.ssl.SSLSessionBindingEvent;

public abstract class Account implements IBaseRate{
    //Common properties for savings and checking accounts
    private String name;
    private String Ssn;
    private double balance;
    private static int index = 10000;
    protected String accountNumber;
    protected double rate;

    //Constructor
    public Account (String name, String Ssn, double initDeposit){
       this.name = name;
       this.Ssn = Ssn;
       balance = initDeposit;
        //Set Account Number
        index++;
        this.accountNumber = setAccountNumber();
        //Get Base Rate
        setRate();
    }

    private String setAccountNumber(){
        String lastTwoOfSsn = Ssn.substring(Ssn.length()-2, Ssn.length());
        int uniqueId = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));
        return lastTwoOfSsn + uniqueId + randomNumber;
    }

    //Show info method returns any relevant information of either checking or savings account
    public void showInfo(){
        System.out.println("\nName: " + name +
                "\nAccount Number: " + accountNumber +
                "\nBalance: R" + balance +
                "\nRate: " + rate + "%");
    }

    public abstract void setRate();

    public void compoundRate(){
        double accruedInterest = balance * (rate/100);
        System.out.println("Accured Interest: R" + accruedInterest);
    }


    //Common methods shared between both accounts
    public void deposit(double amount){
        balance = balance + amount;
        System.out.println("Depositing R" + amount);
        printBalance();
    }
    public void withdraw(double amount){
        balance = balance - amount;
        System.out.println("Withdrawing R" + amount);
        printBalance();
    }
    public void transfer(String toWhere, double amount){
        balance = balance - amount;
        System.out.println("Transferring R" + amount + "to" + toWhere);
        printBalance();
    }
    public void printBalance(){
        System.out.println("Your balance is now: R" + balance);
    }

}
