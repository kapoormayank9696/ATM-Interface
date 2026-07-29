import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount account = new BankAccount(
                1234567890,
                "Mayank",
                20,
                9876543210L,
                5000,
                1234
        );

        ATM atm = new ATM(account);

        int choice;

        do {

            System.out.println("\n========= ATM =========");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Amount: ");
                    double amount = sc.nextDouble();
                    atm.depositMoney(amount);
                    break;

                case 2:
                    System.out.print("Enter Pin: ");
                    int pin = sc.nextInt();

                    System.out.print("Enter Amount: ");
                    double amount1 = sc.nextDouble();

                    atm.withdrawMoney(amount1, pin);
                    break;

                case 3:
                    System.out.print("Enter Pin: ");
                    int pin1 = sc.nextInt();

                    atm.displayBalance(pin1);
                    break;

                case 4:
                    System.out.println("Thank You Visiting In Our ATM");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
