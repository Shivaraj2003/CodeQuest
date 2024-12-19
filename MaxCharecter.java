import java.util.Scanner;

public class MaxCharecter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        char max = input.charAt(0);
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) > max) {
                max = input.charAt(i);
            }
        }
        System.out.println("Largest character: " + max);
    }
}
