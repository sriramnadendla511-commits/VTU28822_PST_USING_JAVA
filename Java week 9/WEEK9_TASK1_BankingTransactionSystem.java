import java.util.Scanner;

public class WEEK9_TASK1_BankingTransactionSystem {
    static class BankAccount {
        private int balance;

        void deposit(int amount) {
            if (amount > 0) balance += amount;
        }

        void withdraw(int amount) {
            if (amount > 0 && amount <= balance) balance -= amount;
        }

        int getBalance() { return balance; }
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int operationCount = input.nextInt();
            BankAccount account = new BankAccount();
            for (int i = 0; i < operationCount; i++) {
                String operation = input.next();
                int amount = input.nextInt();
                if (operation.equalsIgnoreCase("Deposit")) account.deposit(amount);
                else if (operation.equalsIgnoreCase("Withdraw")) account.withdraw(amount);
            }
            System.out.println(account.getBalance());
        }
    }
}
