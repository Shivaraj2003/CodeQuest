import java.util.Scanner;

public class CumulativeSum{
    public static void main(String args[])
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        n=sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        arr=getCumulativeSum(arr);

         for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }

   public static int[] getCumulativeSum (int[] arr) {
		
		for(int i=1;i<arr.length;i++)
		{
			
			arr[i]+=arr[i-1];
		}
		return arr;
	}
	
}