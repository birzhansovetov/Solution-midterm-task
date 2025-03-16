package Online_Payment;

public class PayPalPayment implements PaymentMethod {
    private String email;
    private PayPalAPI payPalAPI;

    public PayPalPayment(String email) {
        this.email = email;
        this.payPalAPI = new PayPalAPI();
    }

    @Override
    public String getPaymentDetails() {
        return "PayPal Account" + email;
    }

    @Override
    public boolean processPayment(double amount) {
        boolean success = payPalAPI .sendPayment(email, amount);
        if (success) {
            System.out.println("Payment successfully sent to PayPal API.");
            return true;
        }else {
            System.out.println("Payment failed to send to PayPal API.");
            return false;
        }
    }

}
