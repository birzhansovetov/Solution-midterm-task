public class WhippedCreamDecorator extends CoffeeDecorator{
    public WhippedCreamDecorator(Coffee decoratedCoffee){
        super(decoratedCoffee);
    }
    @Override
    public double getCost(){
        return decoratedCoffee.getCost()+1.20;
    }
    @Override
    public String getDescription(){
        return decoratedCoffee.getDescription()+"WhippedCream";
    }
}
