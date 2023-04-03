public class ans13 {
    public static void main(String[] args) {
        short shortValue = 12345;

        // Convert short value to String
        String shortString = Short.toString(shortValue);
        System.out.println("Short value " + shortValue + " as a string: " + shortString);

        // Convert short value to Short instance
        Short shortInstance = Short.valueOf(shortValue);
        System.out.println("Short value " + shortValue + " as a Short instance: " + shortInstance);

        // Convert String instance to Short instance
        String stringValue = "6789";
        Short parsedShort = Short.parseShort(stringValue);
        System.out.println("String value " + stringValue + " as a Short instance: " + parsedShort);
    }
}
/*-------------------------------------------------------------------------------------------------------
C:\Users\ankit\OneDrive\Desktop\CDAC\Module_2\OOPJ_Assign1>java ans13      
Short value 12345 as a string: 12345
Short value 12345 as a Short instance: 12345
String value 6789 as a Short instance: 6789
*/