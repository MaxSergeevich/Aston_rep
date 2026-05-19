package lesson_4;

public class Bowl {
    private int foodAmount;

    public Bowl(int initialFood) {
        this.foodAmount = initialFood;
    }

    public boolean takeFood(int amount) {
        if (amount <= foodAmount) {
            foodAmount -= amount;
            return true;
        }
        return false;
    }

    public void addFood(int amount) {
        foodAmount += amount;
        System.out.println("В миску добавлено " + amount + " единиц еды. Теперь в миске " + foodAmount + " единиц.");
    }

    public int getFoodAmount() {
        return foodAmount;
    }
}
