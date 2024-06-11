import java.util.Scanner;

public class caseChanger {
    public static String CAPS(String statement) {
        return statement.toUpperCase();
    }

    public static String smol(String message) {
        return message.toLowerCase();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Wanna change the way your sentence is looking? Welcome to CaseChanger!");
        System.out.println("-------------------------------CASECHANGER----------------------------");
        System.out.println("Enter 1 to change to ALL CAPS or 2 to change to all small: ");
        int c = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the statement: ");
        String statement = sc.nextLine();
        if (c == 1) {
            System.out.println(CAPS(statement));
        } else if (c == 2) {
            System.out.println(smol(statement));
        }

        sc.close();
    }
}
