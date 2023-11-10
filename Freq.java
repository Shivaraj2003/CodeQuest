import java.util.Scanner;

public class Freq {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = sc.nextInt();
        int nums[] = new int[n];
        boolean visited[] = new boolean[n];
        int freq[] = new int[n];

        System.out.println("Enter the array elements");
        for(int i=0; i<n; i++)
        {
            nums[i]=sc.nextInt();
            visited[i]=false;
            freq[i]=1;
        }
        for(int i=0; i<nums.length-1; i++)
        {
            for(int j=i+1; j<nums.length; j++)
            {

                if(nums[i]==nums[j] && visited[j]!=true)
                {
                    freq[i]++;
                    visited[j]=true;
                }

            }

        }

                for(int i=0; i<nums.length; i++)
                {
                    if(visited[i]==false)
                    {
                        System.out.println(nums[i]+":"+ freq[i]);
                    }
                }




    }
}