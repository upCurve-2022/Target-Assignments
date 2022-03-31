import java.io.*;
public class sequence6
{
    public static void sequence(int n)
    {
        int c = 1;
        for (int i = 1; i <= n; i++) 
        {
            if(i%3!=0)
            {
                System.out.print(c + " ");
                c = c+ (4*i);
            }
        }
    }
        
public static void main(String args[])
    {
        int n = 10;
        sequence(n);
    }
}
