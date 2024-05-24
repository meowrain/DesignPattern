public class Main {
    public static void main(String[] args) {
        RefinedCoffee largeCoffee = new LargeCoffee(new Milk());
        largeCoffee.orderCoffee(10);
        RefinedCoffee mediumCoffee = new MediumCoffee(new Sugar());
        mediumCoffee.orderCoffee(10);
        RefinedCoffee smallCoffee = new SmallCoffee(new Sugar());
        smallCoffee.orderCoffee(10);
    }
}
