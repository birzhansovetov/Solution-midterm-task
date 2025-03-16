package Online_Payment;

public class CryptoPayment implements PaymentMethod {
    private String walletAddress;

    public CryptoPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public String getPaymentDetails() {
        return "Crypto wallet address: " + walletAddress;
    }

    @Override
    public boolean processPayment(double amount) {
        if (walletAddress.equals(walletAddress)) {
            System.out.println(" Crypto payment of $" + amount + " to wallet " + walletAddress + " processed.");
            return true;
        }else {
            System.out.println(" Crypto payment of $" + amount + " not processed.");
            return false;
        }
    }
}
