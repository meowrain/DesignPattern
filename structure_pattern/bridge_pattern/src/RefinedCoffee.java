import java.util.Random;

public abstract class RefinedCoffee extends Coffee{
    public RefinedCoffee(ICoffeeAdditives coffeeAdditives) {
        super(coffeeAdditives);
    }

    public void checkQuality() {
        Random random = new Random();
        System.out.println(String.format("%s 添加%s",coffeeAdditives.getClass().getSimpleName(),random.nextBoolean()?"太多":"正常"));
    }
}
