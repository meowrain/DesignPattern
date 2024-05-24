public class Main {
    public static void main(String[] args) {
        ICoffee coffee = new OriginalCoffee();
        coffee.makeCoffee();
        coffee = new MilkDecoratorCoffee(coffee);
        coffee.makeCoffee();
        coffee = new SugarDecoratorCoffee(coffee);
        coffee.makeCoffee();
    }
}
