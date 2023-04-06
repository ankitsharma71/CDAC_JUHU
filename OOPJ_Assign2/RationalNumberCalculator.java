import java.util.Scanner;

public class RationalNumberCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first rational number:");
        int numerator1 = scanner.nextInt();
        int denominator1 = scanner.nextInt();
        RationalNumber rn1 = new RationalNumber(numerator1, denominator1);

        System.out.println("Enter the second rational number:");
        int numerator2 = scanner.nextInt();
        int denominator2 = scanner.nextInt();
        RationalNumber rn2 = new RationalNumber(numerator2, denominator2);

        System.out.println("Enter the arithmetic operation (+, -, *, /):");
        char operator = scanner.next().charAt(0);

        RationalNumber result = null;
        switch (operator) {
            case '+':
                result = rn1.add(rn2);
                break;
            case '-':
                result = rn1.subtract(rn2);
                break;
            case '*':
                result = rn1.multiply(rn2);
                break;
            case '/':
                result = rn1.divide(rn2);
                break;
            default:
                System.out.println("Invalid operator");
        }

        if (result != null) {
            System.out.println("Result: " + result.toString());
        }
    }
}

class RationalNumber {
    private int numerator;
    private int denominator;

    public RationalNumber(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        reduce();
    }

    public RationalNumber add(RationalNumber other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new RationalNumber(newNumerator, newDenominator);
    }

    public RationalNumber subtract(RationalNumber other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new RationalNumber(newNumerator, newDenominator);
    }

    public RationalNumber multiply(RationalNumber other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new RationalNumber(newNumerator, newDenominator);
    }

    public RationalNumber divide(RationalNumber other) {
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new RationalNumber(newNumerator, newDenominator);
    }

    private void reduce() {
        int gcd = gcd(this.numerator, this.denominator);
        this.numerator /= gcd;
        this.denominator /= gcd;
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}

