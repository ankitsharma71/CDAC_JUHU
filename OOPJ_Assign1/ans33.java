public class ans33 {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Please provide at least 3 arguments: an integer, a float, and a double.");
            return;
        }
        
        int num1;
        float num2;
        double num3;
        try {
            num1 = Integer.parseInt(args[0]);
            num2 = Float.parseFloat(args[1]);
            num3 = Double.parseDouble(args[2]);
        } catch (NumberFormatException e) {
            System.out.println("One or more of the input arguments is not a valid number.");
            return;
        }
        
        char operator = '+';
        if (args.length >= 4) {
            operator = args[3].charAt(0);
        }
        
        double result;
        switch (operator) {
            case '+':
                result = num1 + num2 + num3;
                break;
            case '-':
                result = num1 - num2 - num3;
                break;
            case '*':
                result = num1 * num2 * num3;
                break;
            case '/':
                if (num2 == 0 || num3 == 0) {
                    System.out.println("Cannot divide by zero.");
                    return;
                }
                result = num1 / num2 / num3;
                break;
            default:
                System.out.println("Invalid operator: " + operator);
                return;
        }
        
        System.out.println("Result: " + result);
    }
}
/*-------------------------------------------------------------------------------
C:\Users\ankit\OneDrive\Desktop\CDAC\Module_2\OOPJ_Assign1>java ans33 7 1.5 4.7
Result: 13.2
*/