public class ans10 {
    public static void main(String[] args) {
        // Get the number of bits used to represent a char value
        int bitsInChar = Character.SIZE;
        System.out.println("Number of bits used to represent a char value: " + bitsInChar);

        // Get the number of bytes used to represent a char value
        int bytesInChar = Character.BYTES;
        System.out.println("Number of bytes used to represent a char value: " + bytesInChar);

        // Get the minimum value a char can have
        char minValue = Character.MIN_VALUE;
        System.out.println("Minimum value a char can have: " + (int) minValue);

        // Get the maximum value a char can have
        char maxValue = Character.MAX_VALUE;
        System.out.println("Maximum value a char can have: " + (int) maxValue);
    }
}

/*------------------------------------------------------------------------------------------------
C:\Users\ankit\OneDrive\Desktop\CDAC\Module_2\OOPJ_Assign1>java ans10      
Number of bits used to represent a char value: 16
Number of bytes used to represent a char value: 2
Minimum value a char can have: 0
Maximum value a char can have: 65535
*/