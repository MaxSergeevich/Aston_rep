package lesson_4;

public class Cat extends Animal{
    private static int totalCats = 0;
    private boolean isFull;

    public Cat(String name) {
        super(name);
        this.isFull = false;
        totalCats++;
    }

    @Override
    public void run(int m){
        if (m<= 200) {
        System.out.println(name + " пробежал " + m + " м.");
        } else System.out.println(name + " не смог пробежать " + m + " м.");
    }

    @Override
    public void swim(int m){
        if (m!=0) {
        System.out.println(name + " не умеет плавать");
        }
    }

    public static int getTotalCats() {
        return totalCats;
    }
    public boolean isFull() {
        return isFull;
    }

    public void eatFromBowl(Bowl bowl, int foodAmount) {
        if (isFull) {
            System.out.println(name + " уже сыт!");
            return;
        }

        if (bowl.getFoodAmount() >= foodAmount) {
            bowl.foodAmount -= foodAmount;
            isFull = true;
            System.out.println(name + " поел " + foodAmount + " еды и стал сытым. В миске осталось: " + bowl.getFoodAmount());
        } else {
            System.out.println(name + " не стал есть — в миске недостаточно еды (" + bowl.getFoodAmount() + " < " + foodAmount + ").");
        }
    }
}

