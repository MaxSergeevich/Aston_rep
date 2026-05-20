package lesson_4;

public class Triangle extends Figure {
    private double sideA;
    private double sideB;
    private double sideC;


    public Triangle(String fillColor, String borderColor, double sideA, double sideB, double sideC) {
        super(fillColor, borderColor);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getPerimeter() {
        return trianglePerimeter(sideA, sideB, sideC);
    }

    @Override
    public double getArea() {
        return triangleArea(sideA, sideB, sideC);
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
        System.out.printf("Треугольник: Периметр = %.2f, Площадь = %.2f, Цвет заливки = %s, Цвет границы = %s%n",
                getPerimeter(), getArea(), getFillColor(), getBorderColor());
    }
}
