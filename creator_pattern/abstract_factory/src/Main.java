public class Main {
    public static void main(String[] args) {
        System.out.println("===========读卡器===========");
        AbstractFactory cardFactory = FactoryProducer.getFactory("card");
        assert cardFactory != null;
        IIdCard xiaomiCard = cardFactory.getIdCard("Xiaomi");
        xiaomiCard.read();
        IIdCard hpCard = cardFactory.getIdCard("HP");
        hpCard.read();

        System.out.println("===========打印机===========");
        AbstractFactory printFactory = FactoryProducer.getFactory("print");
        assert printFactory != null;
        IPrint xiaomiPrint = printFactory.getPrint("Xiaomi");
        xiaomiPrint.print();
        IPrint HPPrint = printFactory.getPrint("HP");
        HPPrint.print();

        System.out.println("==========扫描器===========");
        AbstractFactory scanFactory = FactoryProducer.getFactory("scan");
        assert scanFactory != null;
        IScan XiaomiScan = scanFactory.getScanner("Xiaomi");
        XiaomiScan.scan();
        IScan HPScan = scanFactory.getScanner("HP");
        HPScan.scan();
    }
}
