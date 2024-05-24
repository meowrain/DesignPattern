public class House {
    private Door door;
    private Roof roof;
    private Wall wall;
    private Window window;

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public Roof getRoof() {
        return roof;
    }

    public void setRoof(Roof roof) {
        this.roof = roof;
    }

    public Wall getWall() {
        return wall;
    }

    public void setWall(Wall wall) {
        this.wall = wall;
    }

    public Window getWindow() {
        return window;
    }

    public void setWindow(Window window) {
        this.window = window;
    }

    public House() {

    }

    @Override
    public String toString() {
        return "House{" +
                "door=" + door +
                ", roof=" + roof +
                ", wall=" + wall +
                ", window=" + window +
                '}';
    }

}
