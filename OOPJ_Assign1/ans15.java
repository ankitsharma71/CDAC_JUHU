public class ans15 {
    public static void main(String[] args) {
        int intValue = 0;

        // Number of bits used to represent int value
        int numBits = Integer.SIZE;
        System.out.println("Number of bits used to represent an int value: " + numBits);

        // Number of bytes used to represent int value
        int numBytes = Integer.BYTES;
        System.out.println("Number of bytes used to represent an int value: " + numBytes);

        // Minimum value of int
        int minValue = Integer.MIN_VALUE;
        System.out.println("Minimum value of an int: " + minValue);

        // Maximum value of int
        int maxValue = Integer.MAX_VALUE;
        System.out.println("Maximum value of an int: " + maxValue);
    }
}
/*---------------------------------------------------------------------------------------------------------
C:\Users\ankit\OneDrive\Desktop\CDAC\Module_2\OOPJ_Assign1>java ans15       
Number of bits used to represent an int value: 32
Number of bytes used to represent an int value: 4
Minimum value of an int: -2147483648
Maximum value of an int: 2147483647
*/