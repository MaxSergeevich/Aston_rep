package lesson_4;

public class Triangle implements Shape {
    private double sideA;
    private double sideB;
    private double sideC;
    private String fillColor;
    private String borderColor;

    public Triangle(double sideA, double sideB, double sideC, String fillColor, String borderColor) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
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
