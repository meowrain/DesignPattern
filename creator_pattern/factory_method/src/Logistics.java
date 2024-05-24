public abstract class Logistics {
    abstract Transport createTransport();
    void simulate_transport(){
        Transport transport = createTransport();
        transport.delivery();
    }
}


