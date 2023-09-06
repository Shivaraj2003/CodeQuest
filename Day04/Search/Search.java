import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Linear Search");
            System.out.println("2. Binary Search");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            if (choice == 3) {
                System.out.println("Exiting program...");
                break;
            }

            System.out.print("Enter the number of elements in the array: ");
            int n = scanner.nextInt();
            int[] arr = new int[n];

            System.out.print("Enter " + n + " integers separated by spaces: ");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            System.out.print("Enter the target element to search for: ");
            int target = scanner.nextInt();

            switch (choice) {
                case 1:
                    int linearIndex = linearSearch(arr, target);
                    if (linearIndex != -1) {
                        System.out.println(target + " found at index " + linearIndex);
                    } else {
                        System.out.println(target + " not found in the array.");
                    }
                    break;
                case 2:
                    int binaryIndex = binarySearch(arr, target);
                    if (binaryIndex != -1) {
                        System.out.println(target + " found at index " + binaryIndex);
                    } else {
                        System.out.println(target + " not found in the array.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
