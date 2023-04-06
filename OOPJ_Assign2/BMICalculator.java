import java.util.Scanner;

public class BMICalculator {
    private double height;
    private double weight;

    public BMICalculator(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double calculateBMI() {
        return weight / (height * height);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your height (in meters): ");
        double height = scanner.nextDouble();
        System.out.print("Enter your weight (in kilograms): ");
        double weight = scanner.nextDouble();
        BMICalculator calculator = new BMICalculator(height, weight);
        double bmi = calculator.calculateBMI();
        System.out.printf("Your BMI is %.2f", bmi);
    }
}
/*-----------------------------------------------------------------------------------
Enter your height (in meters): 1.7
Enter your weight (in kilograms): 75
Your BMI is 25.95
*/