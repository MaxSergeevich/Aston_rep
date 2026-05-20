package lesson_4;

public class Animal {
    private static int totalAnimals = 0;
    protected String name;
    private int foodAmount = 0;

    public Animal(String name) {
        this.name = name;
        totalAnimals++;
    }

    public static int getTotalAnimals() {
        return totalAnimals;
    }

    public void run(int m){
        this.name = name;
        System.out.println(name + " Пробежал " + m + " м.");
    }

    public void swim(int m){
        this.name = name;
        System.out.println(name + " Проплыл " + m + " м.");
    }
    public boolean eat(int amount) {
            if (amount <= foodAmount) {
                foodAmount -= amount;
                return true;
            }
            return false;
        }
    }

