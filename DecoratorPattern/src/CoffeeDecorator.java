// Abstract decorator: Implements the Coffee interface and wraps a Coffee object
public abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee; // Wrapped coffee object

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }

    @Override
    public double getCost() {
        return coffee.getCost();
    }
}
