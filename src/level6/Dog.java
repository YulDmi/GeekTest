package level6;

public class Dog extends Animal {
    public Dog(String name) {
        super(name, 500, 10, 0.5);

    }

    public Dog(String name, int distanceRun, int distanceSwim, double distanceHigh ) {
        super(name, distanceRun, distanceSwim, distanceHigh);
    }
}


/*
 У каждого животного есть ограничения на действия ( бег: кот 200 м., собака 500 м.;
                                                    прыжок: кот 2 м., собака 0.5 м.;
                                                    плавание: кот не умеет плавать, собака 10 м.).
 */