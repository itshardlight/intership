public class BankTask2 {

    private String accountHolder;
    private int balance;

    BankTask2() {
        System.out.println("Welcome to The Bank!!");
    }

    // getter and setters

    public void setaccountHoldert(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getaccountHolder() {
        return accountHolder;
    }

    public void setbalance(int balance) {
        this.balance = balance;
    }

    public int getbalance() {
        return balance;
    }

    public String deposit(int amount) {
        balance += amount;
        return "Transaction Completed Deposited Amt: " + amount;
    }

    public String withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            return "Transaction Completed Withdraw Amt: " + amount;
        } else {
            int amt = getbalance();
            return "Insufficent Balance! Amt: " + amt;
        }
    }
}
