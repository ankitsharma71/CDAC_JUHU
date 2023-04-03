public class ans20 {
    public static void main(String[] args) {
        long num = 1234567890L;

        // Convert long value to String
        String str1 = Long.toString(num);
        System.out.println("Long to String conversion: " + str1);

        // Convert long value to Long instance
        Long obj1 = Long.valueOf(num);
        System.out.println("Long to Long instance conversion: " + obj1);

        // Convert String to Long instance
        String str2 = "9876543210";
        Long obj2 = Long.valueOf(str2);
        System.out.println("String to Long instance conversion: " + obj2);

        // Convert long value to binary string
        String binary = Long.toBinaryString(num);
        System.out.println("Long to binary string conversion: " + binary);

        // Convert long value to octal string
        String octal = Long.toOctalString(num);
        System.out.println("Long to octal string conversion: " + octal);

        // Convert long value to hexadecimal string
        String hex = Long.toHexString(num);
        System.out.println("Long to hexadecimal string conversion: " + hex);
    }
}
/*--------------------------------------------------------------------------------
C:\Users\ankit\OneDrive\Desktop\CDAC\Module_2\OOPJ_Assign1>java ans20       
Long to String conversion: 1234567890
Long to Long instance conversion: 1234567890
String to Long instance conversion: 9876543210
Long to binary string conversion: 1001001100101100000001011010010
Long to octal string conversion: 11145401322
Long to hexadecimal string conversion: 499602d2
*/