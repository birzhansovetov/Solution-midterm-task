
import Coffee_Shop.*;
import Online_Payment.*;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your coffee: 1. Espresso  2. Cappuccino  3. Latte  4. Americano");
        Coffee coffee = CoffeeFactory.createCoffee(scanner.nextLine());
        System.out.println("Choose extras (enter numbers, 0 to finish):");
        System.out.println("1. Milk\n2. Caramel\n3. Whipped Cream\n4. Chocolate");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:new MilkDecorater(coffee); break;
            case 2:new CaramelDecorator(coffee); break;
            case 3:new WhippedCreamDecorator(coffee); break;
            case 4:new ChocolateDecorator(coffee); break;
            default:
                System.out.println("Invalid choice");;
        }
        System.out.println("Your Order: " + coffee.getDescription());
        System.out.printf("Total Cost: $%.2f%n", coffee.getCost());
        System.out.println("Choose payment method: 1. Credit Card  2. PayPal  3. Crypto");

        String method = switch (scanner.nextInt()) {
            case 1 -> "creditcard";
            case 2 -> "paypal";
            case 3 -> "crypto";
            default -> "invalid";
        };
        scanner.nextLine();
        System.out.println("Enter payment details:");
        PaymentMethod payment = PaymentFactory.createPayment(method, scanner.nextLine());
        boolean success = payment.processPayment(coffee.getCost());
        TransactionLogger.logTransaction(new Transaction(payment.getPaymentDetails(), coffee.getCost(), success));
        System.out.println("transcation history:");
        TransactionLogger.showTransactionHistory();

    }
    }
