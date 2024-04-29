public class HouseBuildEngineer {
    private HouseBuilder houseBuilder;

    public HouseBuildEngineer(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void buildHouse() {
        houseBuilder.buildDoor();
        houseBuilder.buildWall();
        houseBuilder.buildRoof();
        houseBuilder.buildWindow();
    }
}
