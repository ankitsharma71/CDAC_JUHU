public class ans29 {
    public static void main(String[] args) {
        Double myDouble = 3.14159;

        // Convert to byte
        byte myByte = myDouble.byteValue();
        System.out.println("myByte = " + myByte);

        // Convert to short
        short myShort = myDouble.shortValue();
        System.out.println("myShort = " + myShort);

        // Convert to int
        int myInt = myDouble.intValue();
        System.out.println("myInt = " + myInt);

        // Convert to long
        long myLong = myDouble.longValue();
        System.out.println("myLong = " + myLong);

        // Convert to float
        float myFloat = myDouble.floatValue();
        System.out.println("myFloat = " + myFloat);

        // Convert to double
        double myDouble2 = myDouble.doubleValue();
        System.out.println("myDouble2 = " + myDouble2);
    }
}
/*---------------------------------------------------------------------------
myByte = 3
myShort = 3
myInt = 3
myLong = 3
myFloat = 3.14159
myDouble2 = 3.14159
*/