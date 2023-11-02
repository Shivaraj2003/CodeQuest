import java.util.*;
import java.lang.*;
import java.io.*;

class CodeChef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int T,n;
		String in;
		String out="";
		
		Scanner sc=new Scanner(System.in);
	
	    T=sc.nextInt();
		
		while(T!=0)
		{
		    n=sc.nextInt();
            out=""; 
		    in=sc.next();
		    char inp[] =in.toCharArray();
		  
		   
    		for(int i=0;i<in.length();i+=2)
    		{
    		    if(inp[i]=='0' && inp[i+1]=='0')
    		        out+="A";

    		    else if(inp[i]=='0' && inp[i+1]=='1')
    		        out+="T";

    		    else if(inp[i]=='1' && inp[i+1]=='0')
    		        out+="C";
    		    else if(inp[i]=='1' && inp[i+1]=='1')
    		        out+="G";
    		}	 
	     System.out.println(out);
		T=T-1;
        }
	}
}
