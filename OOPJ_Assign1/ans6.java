public class ans6 {
    public static void main(String[] args) {
        // Convert boolean value to String
        boolean b1 = true;
        String s1 = String.valueOf(b1);
        System.out.println("Boolean value as String: " + s1);

        // Convert boolean value to Boolean instance
        boolean b2 = false;
        Boolean obj1 = Boolean.valueOf(b2);
        System.out.println("Boolean value as Boolean object: " + obj1);

        // Convert String value to boolean value
        String s2 = "true";
        boolean b3 = Boolean.parseBoolean(s2);
        System.out.println("String value as boolean: " + b3);

        // Convert String value to Boolean instance
        String s3 = "false";
        Boolean obj2 = Boolean.valueOf(s3);
        System.out.println("String value as Boolean object: " + obj2);
    }
}
/*---------------------------------------------------------------------------------
Boolean value as String: true
Boolean value as Boolean object: false
String value as boolean: true
String value as Boolean object: false
*/