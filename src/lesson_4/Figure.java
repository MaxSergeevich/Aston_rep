package lesson_4;

public class Figure implements Shape{

    protected String fillColor;
    protected String borderColor;

    public Figure(String fillColor, String borderColor) {
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public String getFillColor() {
        return "";
    }

    @Override
    public String getBorderColor() {
        return "";
    }

    @Override
    public void printInfo() {

    }
}
