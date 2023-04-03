public class ans30 {
    public static void main(String[] args) {
        double a = 5.5;
        double b = 3.2;

        // find the minimum value
        double minVal = Double.min(a, b);
        System.out.println("Minimum value: " + minVal);

        // find the maximum value
        double maxVal = Double.max(a, b);
        System.out.println("Maximum value: " + maxVal);

        // add two double numbers
        double sum = Double.sum(a, b);
        System.out.println("Sum: " + sum);
    }
}
/*-------------------------------------------------------------
Minimum value: 3.2
Maximum value: 5.5
Sum: 8.7
*/