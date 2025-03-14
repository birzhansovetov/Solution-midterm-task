package Coffee_Shop;

public class CoffeeFactory {
    public static Coffee createCoffee(String coffeeName) {
        switch (coffeeName.toLowerCase()) {
            case "espresso": return new Espresso();
            case "latte": return new Latte();
            case "americano": return new Americano();
            case "cappucino": return new Cappuccino();
            default: throw new IllegalArgumentException("Invalid coffee name: " + coffeeName);
        }
    }
}
