package level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class Game {
    static Random random = new Random();
    char[] ch = new char[15];
    static String[] words = {"apple", "orange", "lemon", "banana", "apricot",
            "avocado", "broccoli", "carrot", "cherry", "garlic",
            "grape", "melon", "leak", "kiwi", "mango",
            "mushroom", "nut", "olive", "pea", "peanut",
            "pear", "pepper", "pineapple", "pumpkin", "potato"};

    public static void main(String[] args)  {
        Game game = new Game();
        int i = random.nextInt(20);
        String puzzled = words[i];
        try {
            game.start(puzzled);
        } catch (IOException e) {
            System.out.println("что-то пошло не так");
        }
    }

    public void start(String puzzled) throws IOException {
        Arrays.fill(ch, '#');
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What word is make?");
        String str =  br.readLine();

        while (!str.equals(puzzled)) {
            print(str, puzzled);
            System.out.println("think more...");
            str = br.readLine();
        }
        System.out.println("You win!!!");
        System.out.println("Do you want to play more? 1 - yes, 0 - no ");
        int answer = Integer.parseInt(br.readLine());
        if (answer == 1) {

            start(words[random.nextInt(20)]);
        }

    }

        public void print(String str, String puzzled) {
        int size = Math.min(str.length(), puzzled.length());
        for (int i = 0; i < size; i++) {
            if (str.charAt(i) == puzzled.charAt(i)) ch[i] = str.charAt(i);
        }
        System.out.println(Arrays.toString(ch));
    }

}

