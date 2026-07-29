public class BankAccount {

    // Data Members
    private long accountNumber;
    private String name;
    private int age;
    private long phoneNumber;
    private double balance;
    private int pin;

    // Default Constructor
    public BankAccount() {}

    // Parameterized Constructor
    public BankAccount(long accountNumber,String name,int age, long phoneNumber,double balance,int pin) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.balance = balance;
        this.pin = pin;
    }

    // Setter
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setPin(int pin) {
        this.pin = pin;
    }

    // Getter
    public long getAccountNumber() {
        return accountNumber;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public long getPhoneNumber() {
        return phoneNumber;
    }
    public double getBalance() {
        return balance;
    }
    public int getPin() {
        return pin;
    }

    // Deposit Method
    public void deposit(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid amount!");
            return;
        }

        this.balance+=amount;
        System.out.println("Deposit Successful.");
    }

    // Withdraw Method
    public void withdraw(double amount,int pin) {
        if(this.pin != pin) {
            System.out.println("WRONG PIN!!!!");
            return;
        }

        if (amount <= 0) {
            System.out.println("Invalid amount!");
            return;
        }

        if(amount > this.balance) {
            System.out.println("Insufficient Balance!");
            return;
        }

        this.balance-=amount;
        System.out.println("Withdrawal Successful.");
    }

    // Display Method
    public double checkBalance(int pin) {

        if(pin != this.pin) {
            System.out.println("Wrong Pin!!!");
            return -1;
        }

        return this.balance;
    }
}
