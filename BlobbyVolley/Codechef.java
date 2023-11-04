import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
		int T;
		Scanner sc=new Scanner(System.in);
	    T=sc.nextInt();
	    int A ,B;
		String in="";
		while(T!=0)
		{
		    int N=sc.nextInt();
		    sc.nextLine();
		    in=sc.nextLine();
		    A=0;
		    B=0;
		    char arr[] = in.toCharArray();
		    char ser= 'A';
            for(int i=0;i<N;i++)
    		{
    		    if(arr[i]=='A')
    		    {
            		if(arr[i]==ser)
                        A++;      
            		else
    		            ser='A';
    		    }
    		    else  if(arr[i]=='B')
    		    {
    		        if(arr[i]==ser)
            		    B++;      
            		else
    		            ser='B';  
    		    }
            }
            System.out.println(A+" "+B);
            T=T-1;    
		}
    }
}
