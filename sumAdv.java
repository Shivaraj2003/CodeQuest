import java.util.Scanner;

public class sumAdv {
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

        System.out.println("Enter the target sum");
        int target_sum = sc.nextInt();

        int[][] ans=SumAdv(nums,target_sum);
        for(int k=0;k<ans.length;k++)
        System.out.println("Answer :["+ans[k][0]+" "+ans[k][1]+"]");

    }


    static int[] SumAdv(int[] nums, int target_sum)
    {
        int ans[][]= new int[10][10];
        int k=0;
        for(int i=0; i<nums.length; i++)
        {
            for(int j=0; j<nums.length; j++)
            {
                if(nums[i]+nums[j]==target_sum) {
                
                }   
            }
        }
        return ans;
    }
}