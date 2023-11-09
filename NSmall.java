import java.util.Scanner;

public class NSmall {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter the array elements");
        for(int i=0; i<n; i++)
        {
            nums[i]=sc.nextInt();
        }

        System.out.println("Enter the value of k");
        int k = sc.nextInt();
        int temp;
        for(int i=0;i<n;i++)
        {
            
                    for(int j=i+1;j<n;j++)
                    {
                        if(nums[j]<nums[i])
                        {
                            temp=nums[i];
                            nums[i]=nums[j];
                            nums[j]=temp;
                        }
                    }


        }


        
        System.out.println(k+"th smallest number is "+nums[k-1]);

    }

}
    