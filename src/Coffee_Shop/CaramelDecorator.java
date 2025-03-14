package Coffee_Shop;

public class CaramelDecorator extends CoffeeDecorator {
    public CaramelDecorator(Coffee decoratedCoffee){
        super(decoratedCoffee);
    }
    @Override
    public double getCost(){
        return decoratedCoffee.getCost() +0.50;
    }
    @Override
    public String getDescription(){
        return decoratedCoffee.getDescription()+"Caramel syrup";
    }
}
