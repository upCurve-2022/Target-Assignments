import java.util.Scanner;
public class SimpleInterest
{
    public static void main (String args[])
    {
        Double p, r,si;
        int t; // principal amount, rate,simple interest and time respecvtively
        Scanner sc=new Scanner(System.in);
        p=sc.nextDouble();
        r=sc.nextDouble();
        t=sc.nextInt();
        si  = (p*r*t)/100;
        System.out.println("Simple Interest is: " +si);
    }
}
