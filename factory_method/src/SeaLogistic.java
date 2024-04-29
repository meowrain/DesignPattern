public class SeaLogistic extends Logistics{
    @Override
    Transport createTransport() {
        return new Ship();
    }
}
