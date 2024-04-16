public class ScanFactory extends AbstractFactory{

    @Override
    public IIdCard getIdCard(String name) {
        return null;
    }

    @Override
    public IPrint getPrint(String name) {
        return null;
    }

    @Override
    public IScan getScanner(String name) {
        if(name.equals("Xiaomi")){
            return new XiaomiScan();
        }else if (name.equals("HP")){
            return new HPScan();
        }else {
            return null;
        }
    }
}
