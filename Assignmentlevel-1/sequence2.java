import java.io.*;
public class Main
{
    public static void sequence2(int n)
    {
         for (int i = 1; i <= n; i++) 
           {
                if (i % 2 == 0)
                {
                    System.out.print(i + " ");
                }
                else
                {
                    System.out.print(-i +" ");
                }
            }
   }

    public static void main(String args[])
    {
        int n = 6;
        sequence(n);
    }
}
