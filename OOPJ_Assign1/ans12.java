public class ans12 {
    public static void main(String[] args) {
        // Get the number of bits used to represent a short value
        int bitsInShort = Short.SIZE;
        System.out.println("Number of bits used to represent a short value: " + bitsInShort);

        // Get the number of bytes used to represent a short value
        int bytesInShort = Short.BYTES;
        System.out.println("Number of bytes used to represent a short value: " + bytesInShort);

        // Get the minimum value a short can have
        short minValue = Short.MIN_VALUE;
        System.out.println("Minimum value a short can have: " + minValue);

        // Get the maximum value a short can have
        short maxValue = Short.MAX_VALUE;
        System.out.println("Maximum value a short can have: " + maxValue);
    }
}
