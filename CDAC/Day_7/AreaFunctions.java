import java.util.Scanner;

public class AreaFunctions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Calculate area of circle");
        System.out.println("2. Calculate area of triangle");
        System.out.println("3. Calculate area of rectangle");
        System.out.println("4. Calculate area of square");
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                double radius = input.nextDouble();
                double circleArea = calculateCircleArea(radius);
                System.out.println("The area of the circle is " + circleArea);
                break;
            case 2:
                System.out.print("Enter the base of the triangle: ");
                double base = input.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = input.nextDouble();
                double triangleArea = calculateTriangleArea(base, height);
                System.out.println("The area of the triangle is " + triangleArea);
                break;
            case 3:
                System.out.print("Enter the length of the rectangle: ");
                double length = input.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = input.nextDouble();
                double rectangleArea = calculateRectangleArea(length, width);
                System.out.println("The area of the rectangle is " + rectangleArea);
                break;
            case 4:
                System.out.print("Enter the length of the square: ");
                double squareLength = input.nextDouble();
                double squareArea = calculateSquareArea(squareLength);
                System.out.println("The area of the square is " + squareArea);
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }

    public static double calculateCircleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    public static double calculateSquareArea(double length) {
        return Math.pow(length, 2);
    }
}
