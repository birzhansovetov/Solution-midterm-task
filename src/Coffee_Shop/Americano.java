package Coffee_Shop;

public class Americano implements Coffee {

    @Override
    public double getCost() {
        return 2.00;
    }

    @Override
    public String getDescription() {
        return "Coffee_Shop.Americano";
    }
}
