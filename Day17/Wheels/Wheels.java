import java.util.Scanner;

public class Wheels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the total number of vehicles (V): ");
        int V = scanner.nextInt();

        System.out.print("Enter the total number of wheels (W): ");
        int W = scanner.nextInt();

        int x = (W - 2 * V) / 2; 
        int y = V - x; 


        System.out.println("TW = " + y + " FW = " + x);

    }
}
