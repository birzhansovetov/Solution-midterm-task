package Online_Payment;

public class CreditCardPayment implements PaymentMethod {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    public boolean processPayment(double amount) {
        if (!cardNumber.equals("Unknown")){
            return true;
        }else {
            return false;
        }

    }
    private String getCardNumber(String cardNumber) {
        if (cardNumber.equals("4")){
            return "Visa";
        }else if (cardNumber.equals("5")){
            return "Mastercard";
        } else if (cardNumber.equals("3")) {
            return "American Express";
        }else {
            return "Unknown";
        }
    }
    public String getPaymentDetails() {
        return "Credit Card Number: " + cardNumber.substring(cardNumber.length() - 4);
    }
}
