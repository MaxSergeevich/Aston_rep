package lesson_4;

    public interface Shape {

        default double circlePerimeter(double radius) {
            return 2 * Math.PI * radius;
        }


        default double circleArea(double radius) {
            return Math.PI * radius * radius;
        }


        default double rectanglePerimeter(double width, double height) {
            return 2 * (width + height);
        }


        default double rectangleArea(double width, double height) {
            return width * height;
        }


        default double trianglePerimeter(double a, double b, double c) {
            return a + b + c;
        }


        default double triangleArea(double a, double b, double c) {
            double s = (a + b + c) / 2; // полупериметр
            return Math.sqrt(s * (s - a) * (s - b) * (s - c));
        }

        double getPerimeter();
        double getArea();
        String getFillColor();
        String getBorderColor();
        void printInfo();
    }
