public abstract class FactoryProducer {
    static AbstractFactory getFactory(String type) {
        if ("Card".equalsIgnoreCase(type)) {
            return new CardFactory();
        } else if ("Print".equalsIgnoreCase(type)) {
            return new PrintFactory();
        } else if ("Scan".equalsIgnoreCase(type)) {
            return new ScanFactory();
        } else {
            return null;
        }
    }
}
