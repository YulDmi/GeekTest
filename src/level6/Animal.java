package level6;

public abstract class Animal {
    protected int distanceRun;
    protected int distanceSwim;
    protected double distanceHigh;
    protected String name;

//    public Animal(String name) {
//            this.name = name;
//    }

    public Animal(String name, int distanceRun, int distanceSwim, double distanceHigh) {
        this.name = name;
        this.distanceRun = distanceRun;
        this.distanceSwim = distanceSwim;
        this.distanceHigh = distanceHigh;

    }

    public void run(int distance) {

        if (distance > distanceRun) System.out.printf("%s : I won't run %d metres! It's too much! %n", name, distance);
        else System.out.printf("%s are running %d metres %n", name, distance);
    }

    public void swim(int distance) {

        if (distance > distanceSwim) System.out.printf("%s : I won't swim %d metres! It's too much! %n", name, distance);
        else System.out.printf("%s are swimming %d metres %n", name, distance);
    }

    public void jump(double high) {

        if (high > distanceHigh) System.out.printf("%s : I won't jump %f metres! It's too much! %n", name, high);
        else System.out.printf("%s are jumping %f metres %n", name, high);
    }

}
