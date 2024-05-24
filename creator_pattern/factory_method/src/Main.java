public class Main {
    public static void main(String[] args) {
        Logistics roadLogistic = new RoadLogistic();
        roadLogistic.simulate_transport();
        Logistics seaLogistic = new SeaLogistic();
        seaLogistic.simulate_transport();
    }
}
