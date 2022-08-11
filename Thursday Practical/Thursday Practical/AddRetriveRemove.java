import java.util.*;
class AddRetriveRemove
{
        public static void main(String[] args)
        {
                ArrayList<String> al = new ArrayList<String>();
                System.out.println("Size of ArrayList: "+al.size());
                
                al.add("ORCHID");
                al.add("CASPIA");
                System.out.println("Elements of first ArrayList: "+al);

                ArrayList<String> al2 = new ArrayList<String>();
                al2.add("ASTER");
                al2.add("LOTUS");
                
                al2.addAll(al);
                System.out.println("Elements of second ArrayList: "+al2);
                
                al2.remove("ASTER");
                System.out.println("Elements of ArrayList after deletion: "+al2);
                System.out.println("Size of ArrayList: "+al2.size());

               
                System.out.println("The element at 2nd index is: "+al2.get(2));
        }
}