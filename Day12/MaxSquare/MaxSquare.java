import java.util.Arrays;
import java.util.Scanner;

public class MaxSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
      arr = getSquareSortedArray(arr);
    

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static int[] getSquareSortedArray (int[] arr) {
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=arr[i]*arr[i];
		}
		
		
		//Arrays.sort(arr);
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[j]<arr[i])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		
		return arr;
	}
}
