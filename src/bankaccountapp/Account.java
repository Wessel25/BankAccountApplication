package bankaccountapp;

import javax.net.ssl.SSLSessionBindingEvent;

public abstract class Account implements IBaseRate{

    //List common properties for savings and checking accounts
    String name;
    String Ssn;
    double balance;
    static int index = 10000;
    String accountNumber;
    double rate;
    //Constructor to SET base properties and initialize account
    public Account (String name, String Ssn, double initDeposit){
       this.name = name;
       this.Ssn = Ssn;
       balance = initDeposit;
        System.out.println("Name: " + name  + " " + "Ssn: " + Ssn + " " + "Balance: " + balance);

        //Set Account Number
        index++;
        this.accountNumber = setAccountNumber();
        System.out.println("Account Number: " + this.accountNumber);
    }

    private String setAccountNumber(){
        String lastTwoOfSsn = Ssn.substring(Ssn.length()-2, Ssn.length());
        return lastTwoOfSsn + index;
    }
    //List common methods
}
