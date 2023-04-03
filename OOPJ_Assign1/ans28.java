public class ans28 {
    public static void main(String[] args) {
        double num = -3.14159;

        // a. double value into String
        String str1 = Double.toString(num);
        System.out.println("double value as string: " + str1);

        // b. double value into Double instance
        Double doubleObj1 = Double.valueOf(num);
        System.out.println("double value as Double instance: " + doubleObj1);

        // c. String instance into Double instance
        String str2 = "-2.71828";
        Double doubleObj2 = Double.parseDouble(str2);
        System.out.println("String as Double instance: " + doubleObj2);

        // d. double value into binary, octal and hexadecimal string
        long doubleToLongBits = Double.doubleToLongBits(num);
        String binaryString = Long.toBinaryString(doubleToLongBits);
        String octalString = Long.toOctalString(doubleToLongBits);
        String hexString = Long.toHexString(doubleToLongBits);
        System.out.println("double value as binary string: " + binaryString);
        System.out.println("double value as octal string: " + octalString);
        System.out.println("double value as hexadecimal string: " + hexString);
    }
}
/*--------------------------------------------------------------------------------------------
double value as string: -3.14159
double value as Double instance: -3.14159
String as Double instance: -2.71828
double value as binary string: 1100000000001001001000011111100111110000000110111000011001101110
double value as octal string: 1400111037476006703156
double value as hexadecimal string: c00921f9f01b866e
*/