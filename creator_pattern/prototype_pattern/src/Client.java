public class Client implements Prototype{
    private String name;
    private String func;
    public Client(String name,String func) {
        this.name = name;
        this.func = func;
    }
    @Override
    public Prototype clone() {
        return new Client(name,func);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFunc() {
        return func;
    }

    public void setFunc(String func) {
        this.func = func;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", func='" + func + '\'' +
                '}';
    }
}
