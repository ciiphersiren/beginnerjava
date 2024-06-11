import java.util.Scanner;

public class MorseCodeDecoder {

    public static String decode(String morseCode) {
        String[] english = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
                "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
                "u", "v", "w", "x", "y", "z", "1", "2", "3", "4",
                "5", "6", "7", "8", "9", "0", ",", ".", "?", "!", "SOS" };

        String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                "..---", "...--", "....-", ".....", "-....", "--...", "---..",
                "----.", "-----", "--..--", ".-.-.-", "..--..", "-.-.--", "...---..." };
        String[] words = morseCode.split(" / ");
        String trString = "";
        for (String l : words) {
            String[] letters = l.split(" ");
            for (String m : letters) {
                for (int i = 0; i < morse.length; i++)
                    if (m.equals(morse[i])) {
                        trString += english[i];
                        break;
                    }
            }
            trString += " ";
        }
        String result = trString.toUpperCase();
        return result.trim();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out
                .println("----------------------------------MORSE CODE DECODER---------------------------------------");
        System.out.println("ENTER THE MORSE CODE: ");
        System.out.println(
                "NOTE: THE LETTERS MUST BE SEPERATED BY A SPACE AND THE WORDS MUST BE SEPERATED IN THIS MANNER ' / '.");
        String morse = sc.nextLine();
        System.out.println("DECODED MESSAGE: " + decode(morse));

        sc.close();
    }
}
