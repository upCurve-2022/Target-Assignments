import java.util.*;
public class stringreverse
{
    public static void main(String[] args)
    {
        System.out.println("Enter any string:");

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        for(int i = str.length() - 1; i >= 0; i--)
        {
            sb.append(str.charAt(i));
        }

        System.out.println("Reversed string is:");
        System.out.println(sb.toString());
    }
}
