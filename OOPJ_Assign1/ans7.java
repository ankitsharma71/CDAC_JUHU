/* 
.Write a program to perform below operations on byte type to get: 
a. The number of bits used to represent a byte value 
b. The number of bytes used to represent a byte value 
c. The minimum value a byte d. The maximum value a byte

*/


class ans7{
    public static void main(String[] args){
        System.out.println("Size :"+Byte.SIZE);
        System.out.println("BYTES :"+Byte.BYTES);
        System.out.println("MAX_VALUE :"+Byte.MAX_VALUE);
        System.out.println("MIN_VALUE :"+Byte.MIN_VALUE);
    }
}

/*-----------------------------------------------------------------
C:\Users\ankit\OneDrive\Desktop\CDAC\Module_2\day_2\day2.2>javac hello.java

C:\Users\ankit\OneDrive\Desktop\CDAC\Module_2\day_2\day2.2>java hello       
Size :8
BYTES :1
MAX_VALUE :127
MIN_VALUE :-128

*/