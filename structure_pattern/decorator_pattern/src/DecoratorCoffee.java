public abstract class DecoratorCoffee implements ICoffee{
    public ICoffee coffee;
    public DecoratorCoffee(ICoffee coffee) {
        this.coffee = coffee;
    }
    @Override
    public void makeCoffee() {
        coffee.makeCoffee();
    }
}
