public class Main {

    public static void main(String[] args) {
        double areaOfCircle = area(5);
        System.out.println("Area of circle: " + areaOfCircle);

        double areaOfRectangle = area(5, 4);
        System.out.println("Area of rectangle: " + areaOfRectangle);
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }

        return Math.pow(radius, 2) * Math.PI;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1;
        }

        return x * y;
    }
}
