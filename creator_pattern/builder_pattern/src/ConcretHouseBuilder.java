public class ConcretHouseBuilder implements HouseBuilder {
    private House house;

    public ConcretHouseBuilder() {
        house = new House();
    }

    public void reset() {
        house = new House();
    }

    @Override
    public void buildDoor() {
        house.setDoor(new Door());
    }

    @Override
    public void buildWall() {
        house.setWall(new Wall());
    }

    @Override
    public void buildRoof() {
        house.setRoof(new Roof());
    }

    @Override
    public void buildWindow() {
        house.setWindow(new Window());
    }

    public House getHouse() {
        return house;
    }
}
