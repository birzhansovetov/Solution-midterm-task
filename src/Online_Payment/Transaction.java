package Online_Payment;

public class Transaction {
    private static int idCounter = 1;
    private final int transactionId;
    private final String method;
    private final double amount;
    private final String status;
    public Transaction(String method, double amount, boolean success) {
        this.transactionId = idCounter++;
        this.method = method;
        this.amount = amount;
        this.status = success ? "Completed" : "Failed";
    }
    public String getTransactionDetails(){
        return "Transaction #" + transactionId + " | " + method + " | $" + amount + " | Status: " + status;
    }
}
