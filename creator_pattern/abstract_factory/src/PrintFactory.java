public class PrintFactory extends AbstractFactory {
    @Override
    public IIdCard getIdCard(String name) {
        return null;
    }

    @Override
    public IPrint getPrint(String name) {
        if (name.equals("Xiaomi")) {
            return new XiaomiPrint();
        } else if (name.equals("HP")) {
            return new HPPrint();
        } else {
            return null;
        }
    }

    @Override
    public IScan getScanner(String name) {
        return null;
    }
}
