public class ans24 {
    public static void main(String[] args) {
        // float value to String
        float f = 3.14f;
        String strFloat = Float.toString(f);
        System.out.println("Float value " + f + " converted to String: " + strFloat);
        
        // float value to Float instance
        Float floatObj = Float.valueOf(f);
        System.out.println("Float value " + f + " converted to Float instance: " + floatObj);
        
        // String instance to Float instance
        String str = "2.718f";
        Float floatObj2 = Float.valueOf(str);
        System.out.println("String " + str + " converted to Float instance: " + floatObj2);
        
        // float value to hexadecimal string
        String hexString = Float.toHexString(f);
        System.out.println("Float value " + f + " converted to hexadecimal string: " + hexString);
    }
}
/*---------------------------------------------------------------------------------------------------------------
C:\Users\ankit\OneDrive\Desktop\CDAC\Module_2\OOPJ_Assign1>java ans24       
Float value 3.14 converted to String: 3.14
Float value 3.14 converted to Float instance: 3.14
String 2.718f converted to Float instance: 2.718
Float value 3.14 converted to hexadecimal string: 0x1.91eb86p1
*/