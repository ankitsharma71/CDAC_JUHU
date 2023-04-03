public class ans14 {
    public static void main(String[] args) {
        Short shortValue = 12345;

        // Convert Short instance to byte
        byte byteValue = shortValue.byteValue();
        System.out.println("Short value " + shortValue + " as a byte: " + byteValue);

        // Convert Short instance to short
        short shortVal = shortValue.shortValue();
        System.out.println("Short value " + shortValue + " as a short: " + shortVal);

        // Convert Short instance to int
        int intValue = shortValue.intValue();
        System.out.println("Short value " + shortValue + " as an int: " + intValue);

        // Convert Short instance to long
        long longValue = shortValue.longValue();
        System.out.println("Short value " + shortValue + " as a long: " + longValue);

        // Convert Short instance to float
        float floatValue = shortValue.floatValue();
        System.out.println("Short value " + shortValue + " as a float: " + floatValue);

        // Convert Short instance to double
        double doubleValue = shortValue.doubleValue();
        System.out.println("Short value " + shortValue + " as a double: " + doubleValue);
    }
}
/*-------------------------------------------------------------------------------------------------------
C:\Users\ankit\OneDrive\Desktop\CDAC\Module_2\OOPJ_Assign1>javac ans14.java 
Short value 12345 as a short: 12345
Short value 12345 as an int: 12345
Short value 12345 as a long: 12345
Short value 12345 as a float: 12345.0
Short value 12345 as a double: 12345.0
*/
