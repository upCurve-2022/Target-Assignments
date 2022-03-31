import java.util.Scanner;
public class leapyear
{

    static boolean isLeapYear(int year)
    {
        return((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)));
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        System.out.println(isLeapYear(year)? "A leap year": "Not a leap year");
    }
}
