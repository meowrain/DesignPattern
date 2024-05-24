public abstract class AbstractFactory {
    public abstract IIdCard getIdCard(String name);
    public abstract IPrint getPrint(String name);
    public abstract IScan getScanner(String name);
}
