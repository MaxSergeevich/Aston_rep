package lesson_4;

public class Circle extends Figure {
    private double radius;


    public Circle(String fillColor, String borderColor, double radius) {
        super(fillColor, borderColor);
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return circlePerimeter(radius);
    }

    @Override
    public double getArea() {
        return circleArea(radius);
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
        System.out.printf("Круг: Периметр = %.2f, Площадь = %.2f, Цвет заливки = %s, Цвет границы = %s%n",
                getPerimeter(), getArea(), getFillColor(), getBorderColor());
    }
}
