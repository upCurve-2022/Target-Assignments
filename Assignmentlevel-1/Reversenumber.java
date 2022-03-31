import java.util.*;
public class Reversenumber
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        long num=in.nextLong();
        long rev=0,rem=0;
        while(num>0)
        {
            rem=num%10;
            if(rem==0)
                System.out.print(rem);
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.print(rev);
    }
}
RE
