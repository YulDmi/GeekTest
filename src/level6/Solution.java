package level6;

public class Solution {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Vaska");
        Cat cat2 = new Cat("Tom", 250, 0, 1.5 );
        Cat cat3 = new Cat("Murka", 200, 10, 1.1);

        Dog dog1 = new Dog("Bobic");
        Dog dog2 = new Dog("Sharik", 600, 150, 0.6);
        Dog dog3 = new Dog("Barbos", 400, 80, 0.4);

        Animal cat4 = new Cat("Shon");

        cat4.swim(2);
        cat1.swim(5);
        cat1.run(110);
        cat2.run(270);
        cat2.run(250);
        cat3.swim(8);
        cat2.swim(5);

        dog1.jump(0.7);
        dog1.jump(0.4);
        dog2.run(750);
        dog2.run(600);
        dog3.run(600);
    }
}
/*
 У каждого животного есть ограничения на действия ( бег: кот 200 м., собака 500 м.;
                                                    прыжок: кот 2 м., собака 0.5 м.;
                                                    плавание: кот не умеет плавать, собака 10 м.).
 */