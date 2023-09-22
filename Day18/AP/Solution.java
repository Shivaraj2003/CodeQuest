import java.util.*;
import java.io.*;

public class Solution {
    public static int[] termsOfAP(int x) {
        int[] ans = new int[x];
        int j = 0;

        for (int i = 0; j < x; i++) {
            int temp = 3 * (i+1) + 2;
            if (temp % 4 != 0) {
                ans[j++] = temp;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of terms");
        int x = sc.nextInt();
        int[] result = termsOfAP(x);
        System.out.println("First " + x + " terms of the arithmetic progression: ");
        for (int term : result) {
            System.out.print(term + " ");
        }
    }
}
