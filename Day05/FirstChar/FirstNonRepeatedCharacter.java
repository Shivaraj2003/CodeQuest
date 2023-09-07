import java.util.Scanner;

public class FirstNonRepeatedCharacter{
    public static char findFirstNonRepeatedCharacter(String str) {
        int n = str.length();
        for (int i = 0; i < n; i++) {
            boolean isRepeated = false;

            for (int j = 0; j < n; j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    isRepeated = true;
                    break;
                }
            }

            if (!isRepeated) {
                return str.charAt(i);
            }
        }

        return '-';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char firstNonRepeated = findFirstNonRepeatedCharacter(input);

        if (firstNonRepeated != '-') {
            System.out.println("The first non-repeated character is: " + firstNonRepeated);
        } else {
            System.out.println("No non-repeated character found in the input string.");
        }

        
    }
}
