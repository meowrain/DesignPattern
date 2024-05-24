public class Main {
    public static void main(String[] args) {
        ConcretHouseBuilder concretHouseBuilder = new ConcretHouseBuilder();
        HouseBuildEngineer houseBuildEngineer = new HouseBuildEngineer(concretHouseBuilder);
        houseBuildEngineer.buildHouse();
        House house = concretHouseBuilder.getHouse();
        System.out.println(house);
    }
}
