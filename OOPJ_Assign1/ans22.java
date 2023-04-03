public class ans22 {
    public static void main(String[] args) {
        Long num1 = 1234567890L;
        Long num2 = 9876543210L;

        Long minNum = Long.min(num1, num2);
        System.out.println("Minimum number: " + minNum);

        Long maxNum = Long.max(num1, num2);
        System.out.println("Maximum number: " + maxNum);

        Long sumNum = Long.sum(num1, num2);
        System.out.println("Sum of two numbers: " + sumNum);
    }
}
/*-------------------------------------------------------------------
C:\Users\ankit\OneDrive\Desktop\CDAC\Module_2\OOPJ_Assign1>java ans22       
Minimum number: 1234567890
Maximum number: 9876543210
Sum of two numbers: 11111111100
*/