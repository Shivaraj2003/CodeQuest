import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	
		Scanner sc=new Scanner(System.in);
	
		int t=sc.nextInt();
		sc.nextLine();
		
		    int n,m;

		    n=sc.nextInt();
		    m=sc.nextInt();

		    int a[]=new int[n];
		    int b[]=new int[m];

		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }

		    for(int i=0;i<m;i++)
		    {
		        b[i]=sc.nextInt();
		    }
		    Solution ob=new Solution();
		    System.out.println(ob.doUnion(a,n,b,m));
		
		
	}
}
class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        
        int count=m+n;
        int ans[]=new int[count];
          
        for(int i=0;i<n;i++)
        {
            ans[i]=a[i];
        }
            
        for(int i=0;i<m;i++)
        {
            ans[n+i]=b[i];
        }
        
      
        Arrays.sort(ans);
        
        for(int i=0;i<m+n-1;i++)
            {
                if(ans[i]==ans[i+1])
                    count--;
            }
    
        
        return count;
    }
}