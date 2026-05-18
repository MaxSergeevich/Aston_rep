package lesson_3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        Product[] productsArray = new Product[5];
        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025","Samsung Corp.", "Korea", 5599, true);
        productsArray[1] = new Product("Meizu Mblu 22 64 Gb","11.01.2025","Meizu Technology","China",5999,true);
        productsArray[2] = new Product("HONOR X5c 64 Gb","21.06.2025","Huawei","China",8499,false);
        productsArray[3] = new Product("HUAWEI nova Y73 256 Gb","01.08.2025","Huawei","China",11999,true);
        productsArray[4] = new Product("Samsung Galaxy A06 64 Gb","08.11.2024"," Samsung Group","China",9799,false);
        System.out.println(Arrays.toString(productsArray));

        Park[] parksArray= new Park[7];
        parksArray[0] = new Park("Island of Dreams","Carousel","12:00-22:00",2700);
        parksArray[1] = new Park("Island of Dreams","Swing snake","12:00-22:00",2700);
        parksArray[2] = new Park("Island of Dreams","Roller coaster","12:00-22:00",2700);
        parksArray[3] = new Park("Island of Dreams","Airplane attraction","12:00-22:00",2700);
        parksArray[4] = new Park("Fairy tale","Rope Park","10:00-22:00",1500);
        parksArray[5] = new Park("Fairy tale","Alpaca Park","10:00-22:00",1500);
        parksArray[6] = new Park("Fairy tale","Ferris wheel \"Sunny\"","10:00-22:00",1500);
        System.out.println(Arrays.toString(parksArray));

    }

}