package level7;

public class Plate {
    private int food;

    public Plate(int food) {
        if (food > 0) this.food = food;
        else System.out.println("Что-то не так. В тарелке нет еды. Коты остануться голодными.");
    }

    public int getFood() {
        return food;
    }


    public void info() {
        System.out.println("В тарелке находится еды : " + food);
    }

    public boolean decreaseFood(int n) {
        if (food < n) return false;
        this.food -= n;
        return true;
    }

    public void addFood(int n) {
        if (n > 0) food += n;
    }
}
