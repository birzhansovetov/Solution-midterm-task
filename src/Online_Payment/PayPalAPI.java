package Online_Payment;

public class PayPalAPI {
    public boolean sendPayment(String email, double amount) {
        System.out.println("Connecting to PayPal API...");
        return email.contains("@");
    }
}
