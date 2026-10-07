import java.util.Locale;
import java.util.Scanner;

public class WEEK9_TASK4_PaymentProcessingSystem {
    interface Payment {
        void pay(double amount);
    }

    static abstract class FeeBasedPayment implements Payment {
        private final String displayName;
        private final double feeRate;

        FeeBasedPayment(String displayName, double feeRate) {
            this.displayName = displayName;
            this.feeRate = feeRate;
        }

        @Override
        public void pay(double amount) {
            double finalAmount = amount * (1.0 + feeRate);
            System.out.printf("%s %.2f%n", displayName, finalAmount);
        }
    }

    static class CreditCardPayment extends FeeBasedPayment {
        CreditCardPayment() { super("CreditCard", 0.02); }
    }

    static class UPIPayment extends FeeBasedPayment {
        UPIPayment() { super("UPI", 0.01); }
    }

    static class NetBankingPayment extends FeeBasedPayment {
        NetBankingPayment() { super("NetBanking", 0.015); }
    }

    static abstract class PaymentProcessor {
        abstract void processPayment(Payment payment, double amount);
    }

    static class OnlinePaymentProcessor extends PaymentProcessor {
        @Override
        void processPayment(Payment payment, double amount) {
            payment.pay(amount);
        }
    }

    static Payment createPayment(int type) {
        switch (type) {
            case 1: return new CreditCardPayment();
            case 2: return new UPIPayment();
            case 3: return new NetBankingPayment();
            default: throw new IllegalArgumentException("Unknown payment type: " + type);
        }
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner input = new Scanner(System.in)) {
            int count = input.nextInt();
            PaymentProcessor processor = new OnlinePaymentProcessor();
            for (int i = 0; i < count; i++) {
                int type = input.nextInt();
                double amount = input.nextDouble();
                processor.processPayment(createPayment(type), amount);
            }
        }
    }
}
