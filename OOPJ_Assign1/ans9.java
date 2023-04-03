public class ans9 {
    public static void main(String[] args) {
        Byte byteValue = 127; // create a Byte instance with value 127
        
        // convert Byte to byte
        byte byteResult = byteValue.byteValue();
        System.out.println("Byte to byte: " + byteResult);
        
        // convert Byte to short
        short shortResult = byteValue.shortValue();
        System.out.println("Byte to short: " + shortResult);
        
        // convert Byte to int
        int intResult = byteValue.intValue();
        System.out.println("Byte to int: " + intResult);
        
        // convert Byte to long
        long longResult = byteValue.longValue();
        System.out.println("Byte to long: " + longResult);
        
        // convert Byte to float
        float floatResult = byteValue.floatValue();
        System.out.println("Byte to float: " + floatResult);
        
        // convert Byte to double
        double doubleResult = byteValue.doubleValue();
        System.out.println("Byte to double: " + doubleResult);
    }
}
/*-----------------------------------------------------------------------
Byte to byte: 127
Byte to short: 127
Byte to int: 127
Byte to long: 127
Byte to float: 127.0
Byte to double: 127.0
*/