import java.util.Scanner;

public class main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Please enter your string (enter \"quit\" for end the proccess): ");
            String st = scanner.nextLine();
            if(st.equals("quit"))
               break;
            if (polindrome(st))
                System.out.println("The stream that you entered is in polindrome shape.");
            else
                System.out.println("The stream that you entered was not in polindrom shape.");

        }
    }

    public static boolean polindrome(String st) {
        int stringLength = st.length();

        for (int i = 0; i < stringLength; i++) {
            if (st.charAt(i) != (st.charAt(stringLength - (i+1)))) {
                return false;
            }
        }
        return true;
    }

}
