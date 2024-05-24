public class MediumCoffee extends RefinedCoffee{
    public MediumCoffee(ICoffeeAdditives coffeeAdditives) {
        super(coffeeAdditives);
    }

    @Override
    public void orderCoffee(int count) {
        System.out.println("订购了中杯咖啡" + count + "杯");
    }
}
