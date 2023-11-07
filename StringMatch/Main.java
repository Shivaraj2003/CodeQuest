import java.util.*;

public class Main
{
public static void main(String[] args) {

String s1,s2;

Scanner sc=new Scanner(System.in);
System.out.println("Enter main string:");
s1 = sc.next();

System.out.println("Enter substring:");
s2 = sc.next();

int a=strStr(s1,s2);
System.out.println("Matching found starting from index "+a);
}


    public static int strStr(String A, String B) {
     
       

        for(int i=0;i<A.length();i++)
        {
            int k=i;
            int isEqual=1;
            for(int j=0;j<B.length();)

            {
                if(A.charAt(k)==B.charAt(j))
                {
                    k++;
                    j++;
                }
                else
                {
                    isEqual=0;
                    j=0;
                    break;
                }
            }
            if(isEqual==1)
            {
                int index=k-B.length();
                return index;
            }

        }
       
        return -1;
    }

}
