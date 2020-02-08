package level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Test7 {
    public static void main(String[] args) {
        Cat[] cats = new Cat[10];
        init(cats);

        int food = askQuestion();
        Plate plate = new Plate(food);
        plate.info();
        diner(plate, cats);

        while ((food = askQuestion()) != -1) {
            plate.addFood(food);
            diner(plate, cats);
        }
    }

    public static int askQuestion() {
        System.out.println("Все ли коты сыты? Нужно ли кормить кого-то?");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Если да - введите кол-во еды на тарелке, если нет - нет:");
        int food = 0;
        try {
            String text = br.readLine();
            if (text.equals("нет")) return -1;
            else food = Integer.parseInt(text);
        } catch (NumberFormatException e) {
            System.out.println("Вы ввели не верные данные");
            food = askQuestion();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return food;
    }

    private static void diner(Plate plate, Cat[] cats) {
        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.printf("Кот %s c аппетитом %d сыт?  - %s%n", cat.getName(), cat.getApp(), cat.isFullness());
            // plate.info();// для отслеживания уменьшения кол-ва еды в тарелке.
        }
        plate.info();
    }

    private static void init(Cat[] cats) {
        Random random = new Random();
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat("Сat" + (i + 1), random.nextInt(20) + 1);
        }
    }
}
