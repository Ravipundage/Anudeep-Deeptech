import java.util.Scanner;

public class UpperCase 
{
    
   public static void main(String[] args)
    {
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter Number: ");
	   	int num = sc.nextInt();
	   	sc.nextLine();
	   	System.out.print("Enter String : ");
        String str = sc.nextLine();
        if(str.length()==num)
        {
        	String upper_str = str.toUpperCase();
        	System.out.println("");
        	System.out.println("Original String: " + str);
        	System.out.println("String in uppercase: " + upper_str);
        }
        else
        {
        	System.out.println("");
        	System.out.println("String Invalid");
        }
    }
}