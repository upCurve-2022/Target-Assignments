import java.util.*;
public class secondlargest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        if (a > b && a > c)
        {
            System.out.println(a+" is largest");
            if (b > c)
                System.out.println(b+" is second largest");
            else
                System.out.println(c+" is second largest");
        }
        else if (b > c) 
        {
            System.out.println(b+" is largest");
            if (a > c)
                System.out.println(a+" is second largest");
            else
                System.out.println(c+" is second largest");

        } 
        else
        {
            System.out.println(c+" is largest");
            if (b > a)
                System.out.println(b+" is second largest");
            else
                System.out.println(a+ "is second largest");
        }

    }
}
