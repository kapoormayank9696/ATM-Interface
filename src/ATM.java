public class ATM {

    private BankAccount account;

    // Parameterized Constructor
    public ATM(BankAccount account) {
        this.account = account;
    }

    // Deposit Method
    public void depositMoney(double amount) {
        account.deposit(amount);
    }

    // Withdraw Method
    public void withdrawMoney(double amount,int pin) {
        account.withdraw(amount,pin);
    }

    // Display Method
    public void displayBalance(int pin) {
        double balance = account.checkBalance(pin);
        if (balance != -1) {
            System.out.println("Current Balance: " + balance);
        }
    }
}
