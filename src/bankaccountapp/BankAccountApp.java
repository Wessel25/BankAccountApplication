package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
    public static void main(String[] args) {
        List<Account> accounts = new LinkedList<Account>();


        //Read a CSV file then create new accounts based on that data
        String file = "C:\\Users\\User\\OneDrive\\Desktop\\NewBankAccounts.csv";
        List<String[]> newAccountHolders = utilities.CSV.read(file);
        for(String[] accountHolder : newAccountHolders){
            String name = accountHolder[0];
            String sSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);

            if(accountType.equals("Savings")){
                accounts.add(new Savings(name, sSN, initDeposit));
            } else if(accountType.equals("Checking")){
                accounts.add(new Checking(name, sSN, initDeposit));
            } else {
                System.out.printf("No Account type found within file");
            }
        }

        //Iterate through accounts for display purposes
        for(Account acc : accounts){
            System.out.printf("\n---------------------------");
            acc.showInfo();
        }

    }
}
