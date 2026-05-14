package lesson_3;

public class Product {

    private final String name;
    private final String date;
    private final String producer;
    private final String country;
    private final double price;
    private final boolean booking;

    public Product(String name, String date, String producer, String country, double price, boolean booking){
        this.name = name;
        this.date = date;
        this.producer = producer;
        this.country = country;
        this.price = price;
        this.booking = booking;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", producer='" + producer + '\'' +
                ", country='" + country + '\'' +
                ", price=" + price +
                ", booking=" + booking +
                '}'+ "\n";
    }
}
