package lesson_4;

public class Bowl {
    protected int foodAmount;

    public Bowl() {
        this.foodAmount = 0;
    }

    public void addFood(int amount) {
        foodAmount += amount;
        System.out.println("В миску добавлено " + amount + " единиц еды. Теперь в миске " + foodAmount + " единиц.");
    }

    public int getFoodAmount() {
        return foodAmount;
    }
}
