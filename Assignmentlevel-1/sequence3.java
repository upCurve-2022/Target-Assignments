import java.util.*;
import java.lang.Math;
public class sequence3
{
    public static void main(String[] args)
    {
        Scanner c=new Scanner(System.in);
        int m;
        System.out.println("Enter number: ");
        m=c.nextInt();
         for(int i=1;i<=m;i++)
        {
                System.out.print((int)Math.pow(i,i)+" ");

        }
    }
}
