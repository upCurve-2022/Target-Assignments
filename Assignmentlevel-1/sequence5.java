import java.io.*;
public class sequence5
{
    public static void sequence(int n)
    {
        int c=1;
        for (int i=1;i<=n;i++)
         if(i%4!=0)
        {
            c=i*i;
            System.out.println(c+" ");

        }
        
   }

    public static void main(String args[])
    {
        int n = 7;
        sequence(n);
    }
}
