public class ans25 {
    public static void main(String[] args) {
        Float floatValue = 123.45f;

        byte byteValue = floatValue.byteValue();
        short shortValue = floatValue.shortValue();
        int intValue = floatValue.intValue();
        long longValue = floatValue.longValue();
        float floatValue2 = floatValue.floatValue();
        double doubleValue = floatValue.doubleValue();

        System.out.println("Byte Value: " + byteValue);
        System.out.println("Short Value: " + shortValue);
        System.out.println("Int Value: " + intValue);
        System.out.println("Long Value: " + longValue);
        System.out.println("Float Value: " + floatValue2);
        System.out.println("Double Value: " + doubleValue);
    }
}
/*-----------------------------------------------------------------
Byte Value: 123
Short Value: 123
Int Value: 123
Long Value: 123
Float Value: 123.45
Double Value: 123.44999694824219
*/