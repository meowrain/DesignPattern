public class MilkDecoratorCoffee extends DecoratorCoffee{

    public MilkDecoratorCoffee(ICoffee coffee) {
        super(coffee);
    }
    @Override
    public void makeCoffee() {
        super.makeCoffee();
        // some methods
        System.out.println("Add Milk");
    }
}
