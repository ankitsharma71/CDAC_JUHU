public class ans21 {
    public static void main(String[] args) {
        Long num = 1234567890L;

        byte byteNum = num.byteValue();
        System.out.println("Long to byte conversion: " + byteNum);

        short shortNum = num.shortValue();
        System.out.println("Long to short conversion: " + shortNum);

        int intNum = num.intValue();
        System.out.println("Long to int conversion: " + intNum);

        long longNum = num.longValue();
        System.out.println("Long to long conversion: " + longNum);

        float floatNum = num.floatValue();
        System.out.println("Long to float conversion: " + floatNum);

        double doubleNum = num.doubleValue();
        System.out.println("Long to double conversion: " + doubleNum);
    }
}
/*---------------------------------------------------------------------------------
C:\Users\ankit\OneDrive\Desktop\CDAC\Module_2\OOPJ_Assign1>java ans21       
Long to byte conversion: -46
Long to short conversion: 722
Long to int conversion: 1234567890
Long to long conversion: 1234567890
Long to float conversion: 1.23456794E9
Long to double conversion: 1.23456789E9
*/