package lesson_6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        //Задание 1
        Set<Student> students = new HashSet<>();

        students.add(new Student("Артур Микайлян", "УНИ-4", 1, Arrays.asList(4, 5)));
        students.add(new Student("Александр Сергеев", "УНИ-2", 2, Arrays.asList(5, 5, 5)));
        students.add(new Student("Татьяна Архипова", "УНИ-44", 3, Arrays.asList(5, 5)));
        students.add(new Student("Эдуард Кузьмин", "УНИ-6", 3, Arrays.asList(3, 3, 2, 3)));
        students.add(new Student("Алла Гришко", "УНИ-7", 2, Arrays.asList(3, 4)));

        System.out.println("  СПИСОК СТУДЕНТОВ  ");
        StudentManager.printStudents(students, 1);
        StudentManager.printStudents(students, 2);
        StudentManager.printStudents(students, 3);
        StudentManager.printStudents(students, 4);

        System.out.println("  ПО ИТОГАМ ЭКЗАМЕНОВ  ");
        StudentManager.removeLowPerformers(students);
        StudentManager.printStudents(students, 1);
        StudentManager.printStudents(students, 2);
        StudentManager.printStudents(students, 3);
        StudentManager.printStudents(students, 4);

        System.out.println("  СЛЕДУЮЩИЙ УЧЕБНЫЙ ГОД  ");
        StudentManager.promoteStudents(students);
        StudentManager.printStudents(students, 1);
        StudentManager.printStudents(students, 2);
        StudentManager.printStudents(students, 3);
        StudentManager.printStudents(students, 4);


        //Задание 2
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Иванов", "+7(913)-123-23-23");
        phoneBook.add("Михайлова", "+7(950)-204-48-78");
        phoneBook.add("Гусько", "+7(909)-345-05-91");
        phoneBook.add("Чехов", "+7(999)-104-78-05");
        phoneBook.add("Чехов", "+7(999)-504-27-33");

        phoneBook.printAll();

        System.out.println("  Поиск по телефонной книге  ");

        System.out.println(phoneBook.get("Чехов"));

        phoneBook.add("Иванчук", "+7(999)-958-45-62");

        phoneBook.printAll();
    }
}
