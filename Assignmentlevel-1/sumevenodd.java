import java.util.*;

public class sumevenodd
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int number=sc.nextInt();

        int Oddsum=0;
        for (int i=1;i<=number;i+=2)
        {
            Oddsum=Oddsum+i;

        }
        int Evensum =0;
        for (int i=0; i<=number ;i+=2)
        {
            Evensum=Evensum+i;

        }
        System.out.println("Odd sum: \n"+ Oddsum);

        System.out.println("Even sum:"+ Evensum);

    }
}
