public class ans26 {
    public static void main(String[] args) {
        float num1 = 10.5f;
        float num2 = 20.7f;

        // finding minimum float number
        float min = Math.min(num1, num2);
        System.out.println("Minimum float number: " + min);

        // finding maximum float number
        float max = Math.max(num1, num2);
        System.out.println("Maximum float number: " + max);

        // adding two float numbers
        float sum = Float.sum(num1, num2);
        System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);
    }
}
/*------------------------------------------------------------------------------------
Minimum float number: 10.5
Maximum float number: 20.7
Sum of 10.5 and 20.7 is 31.2
*/