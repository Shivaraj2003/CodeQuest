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
		String one,two;
		while(T!=0)
		{
		    one = sc.next();
		    two=sc.next();
		    char oneA[]=one.toCharArray();
		    char twoA[] = two.toCharArray();
	        boolean a=true;
    		for(int i=0;i<oneA.length;i++)
    		{
                if(oneA[i]==twoA[i] || (oneA[i]=='?' && twoA[i]!='?') || (oneA[i]!='?' && twoA[i]=='?'))
    		        continue;
    		    else
    		    {
    		        a=false;
    		        break;
    		    }
    		}
            if(a==false)
		        System.out.println("No");
		    else 
		        System.out.println("Yes");
            T=T-1; 
        }  
	}
}
