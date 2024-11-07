package Bank;

public class User {
    private String username;
    private String password;
    private BankAccount account;

    public User(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public BankAccount getAccount() {
        return account;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }

    public void displayAccountDetails() {
        System.out.println("Account details for user: " + this.username);
        System.out.println("Account Number: " + this.account.getAccountNumber());
        System.out.println("Balance: " + this.account.getBalance());


        if (this.account.getTransactionHistory().isEmpty()) {
            System.out.println("No transactions available.");
        } else {
            System.out.println("Transaction History:");
            for (Transaction transaction : this.account.getTransactionHistory()) {
                System.out.println("Date: " + transaction.getDate() + ", Type: " + transaction.getType() + ", Amount: " + transaction.getAmount());
            }
        }
    }

    public void updateUsername(String newUsername){
            this.username = newUsername;

    }


    public void updatePassword(String newPassword) {
            this.password = newPassword;
    }
}
