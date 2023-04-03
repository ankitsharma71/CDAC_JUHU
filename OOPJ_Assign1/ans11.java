public class ans11 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please enter a single character as a command line argument.");
            return;
        }

        char ch = args[0].charAt(0);

        if (Character.isDigit(ch)) {
            System.out.println("The entered character is a digit: " + ch);
            System.out.println("Its value is: " + Character.getNumericValue(ch));
            System.out.println("Its code point is: " + (int) ch);
        } else if (Character.isLetter(ch)) {
            System.out.println("The entered character is a letter: " + ch);
            if (Character.isLowerCase(ch)) {
                char upperCaseCh = Character.toUpperCase(ch);
                System.out.println("Its upper case equivalent is: " + upperCaseCh);
                System.out.println("Its code point is: " + (int) upperCaseCh);
            } else {
                char lowerCaseCh = Character.toLowerCase(ch);
                System.out.println("Its lower case equivalent is: " + lowerCaseCh);
                System.out.println("Its code point is: " + (int) lowerCaseCh);
            }
        } else {
            System.out.println("The entered character is not a letter or a digit.");
        }
    }
}

/*-----------------------------------------------------------------------------------------
C:\Users\ankit\OneDrive\Desktop\CDAC\Module_2\OOPJ_Assign1>java ans11 ankit
The entered character is a letter: a
Its upper case equivalent is: A
Its code point is: 65
*/