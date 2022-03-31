import java.util.Scanner;
public class averagevalue
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements :");

        int arr[] = new int[n];
        double sum = 0;

        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        double avg = sum / n;
        System.out.println("The average of the array elements is " + avg);

    }
}
