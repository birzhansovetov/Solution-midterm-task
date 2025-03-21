package Coffee_Shop;

abstract public class CoffeeDecorator implements Coffee {
    protected Coffee decoratedCoffee;
    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }
    @Override
    public double getCost() {
        return decoratedCoffee.getCost();
    }
    @Override
    public String getDescription(){
        return decoratedCoffee.getDescription();
    }
}
