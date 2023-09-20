import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber {
    public static int findMissingNumber(int array[], int n) {
        Arrays.sort(array);
        for (int i = 0; i < n - 1; i++) {
            if (array[i] != i + 1) {
                return i + 1;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        int[] array = new int[n - 1];
        System.out.println("Enter " + (n - 1) + " distinct integers from 1 to " + n + ":");
        for (int i = 0; i < n - 1; i++) {
            array[i] = scanner.nextInt();
        }

        int missing = findMissingNumber(array, n);
        System.out.println("The missing number is: " + missing);

        
    }
}
