package Online_Payment;

public interface PaymentMethod {
    String getPaymentDetails();
    boolean processPayment(double amount);
}
