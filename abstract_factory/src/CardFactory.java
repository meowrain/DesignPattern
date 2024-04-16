public class CardFactory extends AbstractFactory {

    @Override
    public IIdCard getIdCard(String name) {
        if (name.equals("Xiaomi")) {
            return new XiaomiIdCard();
        } else if (name.equals("HP")) {
            return new HPIdCard();
        } else {
            return null;
        }
    }

    @Override
    public IPrint getPrint(String name) {
        return null;
    }

    @Override
    public IScan getScanner(String name) {
        return null;
    }
}
