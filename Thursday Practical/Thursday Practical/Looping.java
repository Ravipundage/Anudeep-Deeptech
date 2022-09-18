import java.util.Scanner;

public class Looping 
{
	public static void main(String[] args) 
	{
		int counter=1; 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n=sc.nextInt();
		System.out.println("");
		System.out.printf("N\t25*N\t50*N\t75*N\t100*N\n\n", counter, counter*25,counter*50, counter*75 , counter*100); 
		for (counter=1; counter<=n;counter++)
		{ 
			System.out.printf("%d\t%d\t%d\t%d\t%d\n", counter, counter*25,counter*50, counter*75 , counter*100); 
		}
	}
}