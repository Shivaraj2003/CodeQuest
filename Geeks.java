import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}

class Solution
{
    static int majorityElement(int a[], int size)
    {
        int count=1;
        Arrays.sort(a);
        
        if(size==1)
        {
            return a[0];
        }
        for(int i=0;i<a.length-1;i++)
        {
            
            if(a[i]==a[i+1])
            {
                count++;

                if(count>size/2)
                    return a[i];
            }
        
        else
        {
            count=1;
        }
        }
        return -1;
    }
}