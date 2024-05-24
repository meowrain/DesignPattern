public abstract class Coffee {
    ICoffeeAdditives coffeeAdditives;
    public Coffee(ICoffeeAdditives coffeeAdditives) {
        this.coffeeAdditives = coffeeAdditives;
    }
    public abstract void orderCoffee(int count);
}
