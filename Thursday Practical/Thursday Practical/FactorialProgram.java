@FunctionalInterface
interface factorial{
	public void check (int a);
	}

          public class FactorialProgram{

	  public static void main(String[] args) 
          {
	     	factorial fa=(int num)->{
	        int fact=1;
		for(int i=1; i<=num; i++)
	  {
		fact=fact*i;
          }
		  System.out.println("Factorial:"+fact);
		
          };
		fa.check(10);
	  }

   }