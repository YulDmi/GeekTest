package level7;

public class Cat {
    private String name;
    private int app;
    private boolean fullness;

    public Cat(String name, int app) {
        this.name = name;
        this.app = app;
        this.fullness = false;
    }

    public String getName() {
        return name;
    }

    public boolean isFullness() {
        return fullness;
    }

    public int getApp() {
        return app;
    }

    public void eat(Plate plate) {
        if(!fullness)
        fullness = plate.decreaseFood(app);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", app=" + app +
                ", fullness=" + fullness +
                '}';
    }
}
