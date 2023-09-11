import java.util.Scanner;

public class AlternateArray{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of elements");
        int n=sc.nextInt();

        int arr[]=new int[n];
        int res_arr[]=new int[n];


        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }


        for(int i=0; i<n/2; i++)
        {
            res_arr[2*i] = arr[i];
            res_arr[2*i + 1] = arr[n/2 + i];
        }

        for(int i=0; i<n ; i++)
        {
            System.out.print(res_arr[i]+" ");
        }
    }
}