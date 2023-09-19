import java.util.Scanner;

public class SubstringSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the main string (s1): ");
        String s1 = scanner.nextLine();
        
        System.out.print("Enter the substring to search (s2): ");
        String s2 = scanner.nextLine();
        
        int result = findStartIndexOfSubString(s1, s2);
        
        if (result != -1) {
            System.out.println("The first occurrence of '" + s2 + "' in '" + s1 + "' starts at index " + result);
        } else {
            System.out.println("'" + s2 + "' is not a substring of '" + s1 + "'");
        }
        
    }
    
    static int findStartIndexOfSubString(String s1, String s2) {
        int s1Length = s1.length();
        int s2Length = s2.length();
        
        for (int i = 0; i <= s1Length - s2Length; i++) {
            int j;
            
            for (j = 0; j < s2Length; j++) {
                if (s1.charAt(i + j) != s2.charAt(j)) {
                    break;
                }
            }
            
            if (j == s2Length) {
                return i;
            }
        }
        
        return -1;
    }
}
