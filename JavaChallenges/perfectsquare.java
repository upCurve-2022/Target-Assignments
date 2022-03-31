import java.util.Scanner;
public class perfectsquare
{
    public static boolean isPerectSq(int num)
    {
        if (num >= 0)
        {
            int sq = (int)Math.sqrt(num);
            if ((sq*sq) == num)
                return true;
        }
        return false;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPerectSq(num))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
