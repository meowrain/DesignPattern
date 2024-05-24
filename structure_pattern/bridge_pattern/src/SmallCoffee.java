public class SmallCoffee extends RefinedCoffee{
    public SmallCoffee(ICoffeeAdditives coffeeAdditives) {
        super(coffeeAdditives);
    }
    @Override
    public void orderCoffee(int count) {
        System.out.println("订购了小杯咖啡" + count + "杯");
    }
}
