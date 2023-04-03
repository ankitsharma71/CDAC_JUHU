public class ans19 {
    public static void main(String[] args) {
        // Find number of bits used to represent a long value
        int bits = Long.SIZE;
        System.out.println("Number of bits used to represent a long value: " + bits);

        // Find number of bytes used to represent a long value
        int bytes = Long.BYTES;
        System.out.println("Number of bytes used to represent a long value: " + bytes);

        // Find minimum value of a long
        long min = Long.MIN_VALUE;
        System.out.println("Minimum value of a long: " + min);

        // Find maximum value of a long
        long max = Long.MAX_VALUE;
        System.out.println("Maximum value of a long: " + max);
    }
}
/*----------------------------------------------------------------------------------------------
C:\Users\ankit\OneDrive\Desktop\CDAC\Module_2\OOPJ_Assign1>java ans19       
Number of bits used to represent a long value: 64
Number of bytes used to represent a long value: 8
Minimum value of a long: -9223372036854775808
Maximum value of a long: 9223372036854775807
*/
