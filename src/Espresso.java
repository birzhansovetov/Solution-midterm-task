public class Espresso implements Coffee{

    @Override
    public double getCost() {
        return 3.00;
    }

    @Override
    public String getDescription() {
        return "Espresso";
    }
}
