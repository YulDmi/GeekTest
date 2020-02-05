package level6;

public class Cat extends Animal {
    public Cat(String name) {
        super(name, 200 , 0 , 2);

    }

    public Cat(String name, int distanceRun, int distanceSwim, double distanceHigh) {
        super(name, distanceRun, distanceSwim, distanceHigh);
    }

    @Override
    public void swim(int distance) {
        if (distanceSwim == 0) System.out.printf("I can't swim! %s.%n", name);
       else super.swim(distance);
    }
}
/*
 У каждого животного есть ограничения на действия ( бег: кот 200 м., собака 500 м.;
                                                    прыжок: кот 2 м., собака 0.5 м.;
                                                    плавание: кот не умеет плавать, собака 10 м.).
 */