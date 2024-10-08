package bankaccountapp;

public class Checking extends Account {
    private int debitCardNumber;
    private int debitCardPin;

    public Checking (String name, String Ssn, double initDeposit){
        super(name, Ssn, initDeposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();
    }

    public void setRate(){
        rate = getBaseRate() * .15;
    }

    private void setDebitCard(){
        debitCardNumber = (int)(Math.random() * Math.pow(10, 12));
        debitCardPin = (int)(Math.random() * Math.pow(10, 4));
    }
    
    //Overriding showInfo to specify the type of account
    public void showInfo(){
        super.showInfo();
        System.out.println(
                "[Your Checkings Account features]" +
                        "\nDebit Card Number: " + debitCardNumber +
                        "\nDebit Card Pin: " + debitCardPin
        );
        super.printBalance();
    }
}
