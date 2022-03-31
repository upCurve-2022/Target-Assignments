import java.util.Scanner;
public class wholenumfraction
{

    public static void main(String[] args) 
    {
        Scanner myObj= new Scanner(System.in);
        System.out.println("Enter any Number:");
        double n = myObj.nextDouble();
        int s=(int) n;
        double t;
        t=n-s;
        String str;
        str=t+" ";
        //System.out.println(str);
        String str1=str.substring(2,5);
        //str1=str1.substring(0,2);
        t=Double.parseDouble(str1);
        int p=(int) t;
        System.out.println(s);
        System.out.println(p);
    }
}
