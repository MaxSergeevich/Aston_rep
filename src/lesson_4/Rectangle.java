package lesson_4;

public class Rectangle extends Figure {
    private double width;
    private double height;


    public Rectangle(String fillColor, String borderColor, double width, double height) {
        super(fillColor, borderColor);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return rectanglePerimeter(width, height);
    }

    @Override
    public double getArea() {
        return rectangleArea(width, height);
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }

    @Override
    public void printInfo() {
        System.out.printf("Прямоугольник: Периметр = %.2f, Площадь = %.2f, Цвет заливки = %s, Цвет границы = %s%n",
                getPerimeter(), getArea(), getFillColor(), getBorderColor());
    }
}
