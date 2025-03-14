import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter coffee name: ");
        String coffeeName = scanner.nextLine();
        Coffee coffee = switch (coffeeName){
            case "americano" -> new Americano();
            case "cappucino" -> new Cappuccino();
            case "latte" -> new Latte();
            case "espresso" -> new Espresso();
            default -> throw new IllegalArgumentException("Invalid coffee name: " + coffeeName);
        };
        System.out.println("Choose extras (enter numbers, 0 to finish):");
        System.out.println("1. Milk\n2. Caramel\n3. Whipped Cream\n4. Chocolate");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch(choice){
            case 1:new MilkDecorater(coffee); break;
            case 2:new CaramelDecorator(coffee); break;
            case 3:new WhippedCreamDecorator(coffee); break;
            case 4:new ChocolateDecorator(coffee); break;
            default:
                System.out.println("Invalid choice");;
        }
        System.out.println("Your Order: " + coffee.getDescription());
        System.out.printf("Total Cost: $%.2f%n", coffee.getCost());
    }
}