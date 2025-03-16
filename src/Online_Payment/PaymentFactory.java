package Online_Payment;

public class PaymentFactory {
    public static PaymentMethod createPayment(String type,String details) {
        return switch (type.toLowerCase()){
            case "creditcard" -> new CreditCardPayment(details);
            case "paypal" -> new PayPalPayment(details);
            case "crypto" -> new CryptoPayment(details);
            default -> throw new IllegalArgumentException("Invalid payment method.");
        };
    }
}
