import java.util.*;
public class Compare{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();
        String str3 = in.next();
        System.out.println("Comparing " + str1 + " and " + str2+ " : " + str1.equals(str2));
        System.out.println("Comparing " + str1 + " and " + str3+ " : " + str1.equalsIgnoreCase(str3)); 
         System.out.println("Comparing " + str1 + " and " + str2+ " : " + Objects.equals(str1, str2));
           //returns 0 if strings are equal 
        System.out.println("Comparing " + str1 + " and " + str2+ " : " + str1.compareTo(str2));
         System.out.println(str1.equals(str2));
   }
}