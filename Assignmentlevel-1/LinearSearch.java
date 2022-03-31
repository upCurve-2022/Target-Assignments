import java.util.Scanner;
public class LinearSearch 
{
    public static void main(String[] args)
    {
        int n,search,i,flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        n=sc.nextInt();
        System.out.println("Enter the elements of array: ");
        int[] arr = new int[n];
        for(i=0; i<n; i++)
            arr[i]=sc.nextInt();
        System.out.print("Enter the element to search: ");
        search = sc.nextInt();
        for(i=0; i<arr.length; i++)
            if(arr[i] == search)
            {
                flag = 1;
                break;
            }
        if(flag == 1)
            System.out.print("Found at position "+(i+1));
        else
            System.out.print("Not found");
    }
}
