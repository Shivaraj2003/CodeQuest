import java.util.Scanner;

public class PalindromeString{

    public static void main(String args[]){
    System.out.println("Enter the input string");
    Scanner sc = new Scanner(System.in);
    String in=sc.nextLine();

    boolean res=isPalindrome(in);

    if(res)
    {
        System.out.println("Palindrome");
    }
    else
    {
        System.out.println("Not a Palindrome");
    }

    }

   static boolean isPalindrome(String s)
   {
    char arr[] = s.toCharArray();
    String ans="";
    for(char c:arr)
    {
        if((c>='A' && c<='Z')|| (c>='a' && c<='z')||(c>='0' && c<='9'))
            ans+=String.valueOf(c).toLowerCase();
            //ans+=c;
    }
    int l=0;
    int r=ans.length()-1;
    while(l<=r)
    {
        if(ans.charAt(l)!=ans.charAt(r))
        {
            return false;
        }
        l++;
        r--;
    }

return true;
  } 
}