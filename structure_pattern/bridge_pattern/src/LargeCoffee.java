public class LargeCoffee extends RefinedCoffee  {
    public LargeCoffee(ICoffeeAdditives coffeeAdditives) {
        super(coffeeAdditives);
    }

    @Override
    public void orderCoffee(int count) {
        System.out.println("订购了大杯咖啡" + count + " 杯" );
    }

}
