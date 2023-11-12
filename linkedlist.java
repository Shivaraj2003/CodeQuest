import java.util.*;
public class linkedlist
{
  public static void main(String[] args) 
  {
	List names = new LinkedList();
	names.add("Rams");
	names.add("Posa");
	names.add("Chinni");
    names.add(2011);


    Scanner sc = new Scanner(System.in);

	System.out.println("LinkedList content: " + names);
	System.out.println("LinkedList size: " + names.size());

    System.out.println("Enter the value of n");
    int n = sc.nextInt();
    System.out.println("LinkedList value: " + names.get(names.size()-n));
    names.remove(names.size()-n);

    
	System.out.println("LinkedList size: " + names.size());
  }
}