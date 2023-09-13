import java.util.Scanner;

public class DigitFreq {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String in = sc.nextLine();

        char a[] = in.toCharArray();
        int cnt[] = new int[10]; 

        for (int i = 0; i < a.length; i++) {
            if (a[i] >= '0' && a[i] <= '9') {
                int digit = a[i] - '0'; 
                cnt[digit]++;
            }
        }

        for (int i = 0; i <= 9; i++) {
            System.out.print(cnt[i]+" ");
        }
    }
}
