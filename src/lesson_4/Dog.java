package lesson_4;

public class Dog extends Animal{
    private static int totalDogs = 0;
    public Dog(String name) {
        super(name);
        totalDogs++;
    }
    public static int getTotalDogs() {
        return totalDogs;
    }
    @Override
    public void run(int m){
        if (m<= 500) {
            System.out.println(name + " пробежал " + m + " м.");
        } else System.out.println(name + " не смог пробежать " + m + " м.");
    }

    @Override
    public void swim(int m) {
        if (m > 10) {
            System.out.println(name + " не смог проплыть " + m + " м.");
        } else System.out.println(name + " проплыл " + m + " м.");
    }
}
