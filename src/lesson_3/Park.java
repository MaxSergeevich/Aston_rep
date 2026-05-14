package lesson_3;

public class Park {

    private final String name;
    private final String attraction;
    private final String time;
    private final double price;

    public Park(String name, String attraction, String date , double price){
        this.name = name;
        this.attraction = attraction;
        this.time = date;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Park{" +
                "name='" + name + '\'' +
                ", attraction='" + attraction + '\'' +
                ", time='" + time + '\'' +
                ", price=" + price +
                '}'+ "\n";
    }
}
