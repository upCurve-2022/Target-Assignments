public class Swap3Numbers
{
public static void main( String[] args)
{
int num1=10;
int num2 =20; 
int num3 =30;
System.out.println("Before swapping:");
System.out.println("Value of number 1 is " +num1);
System.out.println("Value of number 2 is " +num2);
System.out.println("Value of number 3 is " +num3);
int temp = num1;
num1 = num2; 
num2= num3;
num3= temp;
System.out.println("After swapping are:");
System.out.println("Value of number 1 is " +num1);
System.out.println("Value of number 2 is " +num2); 
System.out.println("Value of number 3 is " +num3);
}
}
