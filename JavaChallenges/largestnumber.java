import java.util.Scanner;

public class largestnumber 
{
    public static void main(String[] args) 
    {
	    Scanner MyObj= new Scanner(System.in);
        System.out.println("Enter three integers:");
        int no1= MyObj.nextInt();
        int no2= MyObj.nextInt();
        int no3= MyObj.nextInt();

        int max;
        max=no1>no2?no1:no2;
        max=max>no3?max:no3;

        System.out.println("The largest number is:"+max);
    }
}
