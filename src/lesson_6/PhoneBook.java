package lesson_6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void add(String surname, String phoneNumber) {

        if (phoneBook.containsKey(surname)) {
            phoneBook.get(surname).add(phoneNumber);
        } else {
            List<String> numbers = new ArrayList<>();
            numbers.add(phoneNumber);
            phoneBook.put(surname, numbers);
        }
    }

    public void printAll() {
        System.out.println("  ТЕЛЕФОННЫЙ СПРАВОЧНИК  ");
        for (Map.Entry<String, List<String>> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    public List<String> get(String surname) {
        List<String> numbers = phoneBook.get(surname);
        if (numbers == null) {
            return null;
        }
        return new ArrayList<>(numbers);
    }
}
