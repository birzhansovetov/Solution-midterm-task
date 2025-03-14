public class MilkDecorater extends CoffeeDecorator{
    public MilkDecorater(Coffee decoratedCoffee){
        super(decoratedCoffee);
    }

    @Override
    public double getCost(){
        return decoratedCoffee.getCost() +0.50;
    }
    @Override
    public String getDescription(){
        return decoratedCoffee.getDescription() + "Milk";
    }
}
