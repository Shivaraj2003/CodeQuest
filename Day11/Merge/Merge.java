import java.util.Scanner;

class Merge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the first array: ");
        int sizeA = scanner.nextInt();

        int[] A = new int[sizeA];

        System.out.println("Enter the elements of the first array in increasing order:");
        for (int i = 0; i < sizeA; i++) {
            A[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the size of the second array: ");
        int sizeB = scanner.nextInt();
        int[] B = new int[sizeB];
        System.out.println("Enter the elements of the second array in increasing order:");
        for (int i = 0; i < sizeB; i++) {
            B[i] = scanner.nextInt();
        }
        
        int[] mergedArray = mergeSortedArrays(A, B);
        
        System.out.println("Merged sorted array: ");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
        
        
    }

    static int[] mergeSortedArrays(int[] A, int[] B) {
        int a = A.length;
        int b = B.length;
        int c = a + b;
        int[] C = new int[c];
        
        int i = 0, j = 0, k = 0;
        
        while (i < a && j < b) {
            if (A[i] < B[j]) {
                C[k] = A[i];
                i++;
            } else {
                C[k] = B[j];
                j++;
            }
            k++;
        }
        
        
        while (i < a) {
            C[k] = A[i];
            i++;
            k++;
        }
        
        while (j < b) {
            C[k] = B[j];
            j++;
            k++;
        }
        
        return C;
    }
}
