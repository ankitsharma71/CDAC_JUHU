public class ans17 {
    public static void main(String[] args) {
        Integer intValue = 12345;

        // Convert Integer instance to byte
        byte byteValue = intValue.byteValue();
        System.out.println("Integer value " + intValue + " as a byte: " + byteValue);

        // Convert Integer instance to short
        short shortValue = intValue.shortValue();
        System.out.println("Integer value " + intValue + " as a short: " + shortValue);

        // Convert Integer instance to int
        int intValueAgain = intValue.intValue();
        System.out.println("Integer value " + intValue + " as an int: " + intValueAgain);

        // Convert Integer instance to long
        long longValue = intValue.longValue();
        System.out.println("Integer value " + intValue + " as a long: " + longValue);

        // Convert Integer instance to float
        float floatValue = intValue.floatValue();
        System.out.println("Integer value " + intValue + " as a float: " + floatValue);

        // Convert Integer instance to double
        double doubleValue = intValue.doubleValue();
        System.out.println("Integer value " + intValue + " as a double: " + doubleValue);
    }
}

/*-------------------------------------------------------------------------------------------------
C:\Users\ankit\OneDrive\Desktop\CDAC\Module_2\OOPJ_Assign1>java ans17       
Integer value 12345 as a byte: 57
Integer value 12345 as a short: 12345
Integer value 12345 as an int: 12345
Integer value 12345 as a long: 12345
Integer value 12345 as a float: 12345.0
Integer value 12345 as a double: 12345.0
*/