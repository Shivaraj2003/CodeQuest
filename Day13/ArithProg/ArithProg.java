import java.util.Arrays;
import java.util.Scanner;

class ArithProg {
 public static  boolean soln(int[] arr) {
        

        int n = arr.length;

        if (n < 2) {
            return false;
        }

        Arrays.sort(arr); 

        int d = arr[1] - arr[0]; 

        for (int i = 2; i < n; i++) {
            if (arr[i] - arr[i - 1] != d) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        boolean result =soln(arr);
        if (result) {
            System.out.println("The input array can be reordered to form an arithmetic sequence.");
        } else {
            System.out.println("The input array cannot be reordered to form an arithmetic sequence.");
        }
    }
}
