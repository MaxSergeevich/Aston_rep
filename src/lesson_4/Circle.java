package lesson_4;

public class Circle implements Shape {
    private double radius;
    private String fillColor;
    private String borderColor;

    public Circle(double radius, String fillColor, String borderColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
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
