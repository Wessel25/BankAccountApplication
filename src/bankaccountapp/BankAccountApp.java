package bankaccountapp;

public class BankAccountApp {
    public static void main(String[] args) {

        //Read a CSV file then create new accounts based on that data
        Checking checking = new Checking("Pollos Armanos", "123456789", 15000);
        Savings savings = new Savings("Wessel Oosthuizen", "123456987", 20000);

    }
}
