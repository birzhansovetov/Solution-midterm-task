package Coffee_Shop;

public class Latte implements Coffee {

    @Override
    public double getCost() {
        return 3.50;
    }

    @Override
    public String getDescription() {
        return "Coffee_Shop.Latte";
    }
}
