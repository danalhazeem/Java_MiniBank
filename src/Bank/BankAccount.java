package Bank;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private List<Transaction> transactionHistory;


    public BankAccount(String accountNumber ){
        this.accountNumber = accountNumber;
        this.transactionHistory = new ArrayList<>();
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<Transaction> getTransactionHistory() {
        return transactionHistory;
    }

    public void setTransactionHistory(List<Transaction> transactionHistory) {
        this.transactionHistory = transactionHistory;
    }

    public void deposit(double amount){
        if (amount >0){
            balance +=amount;
            transactionHistory.add(new Transaction(new Date(),"deposit",amount));

        }
        else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdrawal(double amount){
        if (amount>0 && amount <=balance){
            balance -=amount;
            transactionHistory.add(new Transaction(new Date(),"withdrawal",amount));
        }else if (amount<balance){
            System.out.println("Insufficient funds.");
        }else{
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public void displayTransactionHistory() {
        System.out.println("Transaction History for Account " + accountNumber + ":");
        for (Transaction transaction : transactionHistory) {
            System.out.println("Date: " + transaction.getDate() + ", Type: " + transaction.getType() +
                    ", Amount: $" + transaction.getAmount());
        }
    }


}
