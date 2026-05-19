package lesson_4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Рыжик"),
                new Cat("Барсик"),
                new Cat("Лапка"),
                new Cat("Снежок")
        };

        System.out.println("Проверка выполнения действий");
        Dog rex = new Dog("Рекс");
        rex.run(250);
        rex.swim(5);

        Cat sonya = new Cat("Соня");
        sonya.run(250);
        sonya.swim(3);

        Bowl bowl = new Bowl(10);
        System.out.println("В миске: " + bowl.getFoodAmount() + " единиц еды");

        System.out.println("Первая попытка котов поесть ");
        for (Cat cat : cats) {
            cat.eatFromBowl(bowl, 5);
        }

        System.out.println("Добавляем в миску еды");
                bowl.addFood(10);

        System.out.println("Оставшиеся коты пытаются поесть");
        for (Cat cat : cats) {
            if (!cat.isFull()) {
                cat.eatFromBowl(bowl, 5);
            }
        }

        System.out.println("Статистика сытости");
        for (Cat cat : cats) {
            System.out.println(cat.name + " сыт: " + cat.isFull());
        }

        System.out.println("Всего животных: " + Animal.getTotalAnimals());
        System.out.println("Всего котов: " + Cat.getTotalCats());
        System.out.println("Всего собак: " + Dog.getTotalDogs());


        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(8.0, "Белый", "Чёрный"));
        shapes.add(new Rectangle(44.0, 2.0, "Зеленый", "Белый"));
        shapes.add(new Triangle(5.0, 8.0, 5.0, "Зелёный", "Жёлтый"));

        for (Shape shape : shapes) {
            shape.printInfo();
        }
    }

}
