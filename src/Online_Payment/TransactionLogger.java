package Online_Payment;

import java.util.ArrayList;
import java.util.List;
public class TransactionLogger {
    private static final List<Transaction> transactions = new ArrayList<>();
    public static void logTransaction(Transaction transaction) { transactions.add(transaction); }
    public static void showTransactionHistory() {
        if (transactions.isEmpty()) System.out.println("No transactions found.");
        else transactions.forEach(t -> System.out.println(t.getTransactionDetails()));
    }
}
