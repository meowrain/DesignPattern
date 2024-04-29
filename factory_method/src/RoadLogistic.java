public class RoadLogistic extends Logistics{

    @Override
    Transport createTransport() {
        return new Truck();
    }
}
