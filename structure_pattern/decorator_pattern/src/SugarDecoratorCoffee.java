public class SugarDecoratorCoffee extends DecoratorCoffee{
    public SugarDecoratorCoffee(ICoffee coffee) {
        super(coffee);
    }
    @Override
    public void makeCoffee() {
        super.makeCoffee();
        // some methods
        System.out.println("Add sugar");
    }
}
