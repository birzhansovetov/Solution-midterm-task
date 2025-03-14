package Coffee_Shop;

public class ChocolateDecorator extends CoffeeDecorator {
    public ChocolateDecorator(Coffee decoratedCoffee){
        super(decoratedCoffee);
    }
    @Override
    public double getCost(){
        return decoratedCoffee.getCost()+1.20;
    }
    @Override
    public String getDescription(){
        return decoratedCoffee.getDescription()+"Chocolate Syrup";
    }
}
