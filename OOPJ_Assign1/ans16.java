public class ans16 {
    public static void main(String[] args) {
        int intValue = 12345;

        // Convert int value to String
        String intStr = Integer.toString(intValue);
        System.out.println("Int value " + intValue + " as a string: " + intStr);

        // Convert int value to Integer instance
        Integer intInstance = Integer.valueOf(intValue);
        System.out.println("Int value " + intValue + " as an Integer instance: " + intInstance);

        // Convert String instance to Integer instance
        String strValue = "6789";
        Integer intFromString = Integer.valueOf(strValue);
        System.out.println("String value " + strValue + " as an Integer instance: " + intFromString);

        // Convert int value to binary, octal and hexadecimal strings
        String binaryStr = Integer.toBinaryString(intValue);
        System.out.println("Int value " + intValue + " as a binary string: " + binaryStr);

        String octalStr = Integer.toOctalString(intValue);
        System.out.println("Int value " + intValue + " as an octal string: " + octalStr);

        String hexStr = Integer.toHexString(intValue);
        System.out.println("Int value " + intValue + " as a hexadecimal string: " + hexStr);
    }
}

/*----------------------------------------------------------------------------------------------------
C:\Users\ankit\OneDrive\Desktop\CDAC\Module_2\OOPJ_Assign1>java ans16       
Int value 12345 as a string: 12345
Int value 12345 as an Integer instance: 12345
String value 6789 as an Integer instance: 6789
Int value 12345 as a binary string: 11000000111001
Int value 12345 as an octal string: 30071
Int value 12345 as a hexadecimal string: 3039
*/