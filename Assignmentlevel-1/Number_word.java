import java.util.*;
public class Number_word
{
   public static void main(String args[])
      {
         Scanner in=new Scanner(System.in);
          int num=in.nextInt();
          int rev=0,rem=0;
          while(num>0)
           {
              rem=num%10;
              rev=rev*10+rem;
              num=num/10;
            }
         while(rev!= 0)
         {
          switch(rev% 10)
           {
            case 0: 
                System.out.print("Zero ");
                break;
            case 1: 
                System.out.print("One ");
                break;
            case 2: 
                System.out.print("Two ");
                break;
            case 3: 
                System.out.print("Three ");
                break;
            case 4: 
                System.out.print("Four ");
                break;
            case 5: 
                System.out.print("Five ");
                break;
            case 6: 
                System.out.print("Six ");
                break;
            case 7: 
                System.out.print("Seven ");
                break;
            case 8: 
                System.out.print("Eight ");
                break;
            case 9: 
                System.out.print("Nine ");
                break;
        }
        
        rev/= 10;
    }
  }
}