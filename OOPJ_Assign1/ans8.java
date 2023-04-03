/* 8.Write a program to convert:
a. byte value into String
b. byte value into Byte instance.
c. String instance into Byte instance.
*/

public class ans8 {
    public static void main(String[] args) {
        // Convert byte value to String
        byte b = 10;
        String s = Byte.toString(b);
        System.out.println("Byte value " + b + " converted to String: " + s);

        // Convert byte value to Byte instance
        Byte byteObj = Byte.valueOf(b);
        System.out.println("Byte value " + b + " converted to Byte instance: " + byteObj);

        // Convert String instance to Byte instance
        String str = "25";
        Byte byteObj2 = Byte.valueOf(str);
        System.out.println("String value " + str + " converted to Byte instance: " + byteObj2);
    }
}

/******************************************************************************************************

Byte value 10 converted to String: 10
Byte value 10 converted to Byte instance: 10
String value 25 converted to Byte instance: 25

 */