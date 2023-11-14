import java.util.Scanner;
class happy{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int c1=0,c2=0,c3=0;
    System.out.println("Enter the string ");
    String s=sc.next();
    char[] C=s.toCharArray();
    for(char c:C)
    {
            if (c == '(') {
                if(c1<0)
                break;
                c1++;
            } else if (c == ')') {
                
                c1--;
            } else if (c == '{') {
                if(c2<0)
                break;
                c2++;
            } else if (c == '}') {
                c2--;
            }else if (c == '[') {
                if(c3<0)
                break;
                c3++;
            } else if (c == ']') {
                c3--;
            }
        }
        boolean res=c1==0 && c2==0 && c3==0;
        if(res==true)
            System.out.println("True");
        else
            System.out.println("False");

    }
}

    

