public class Cappuccino implements Coffee{

    @Override
    public double getCost() {
        return 2.50;
    }

    @Override
    public String getDescription() {
        return "Cappuccino";
    }
}
