import java.util.*;
public class ascii 
{

    public static void main(String[] args)
    {
        char ch ;
        Scanner sc=new Scanner(System.in);
        ch=sc.next().charAt(0);
        int asciiValue = ch;
        System.out.println("ASCII value of "+ch+" is: " + asciiValue);
    }
}
