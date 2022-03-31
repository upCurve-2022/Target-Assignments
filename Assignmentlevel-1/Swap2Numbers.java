public class Swap2Numbers
{
public static void main(String[] args)
{
int num1=10;
int num2 =20;
System.out.println("Before swapping:");
System.out.println("Value of number 1 is " +num1); 
System.out.println("Value of number 2 is " +num2);
int temp = num1;
num1 = num2;
num2 = temp;
System.out.println("After swapping :");
System.out.println("Value of number 1 is " +num1);
System.out.println("Value of number 2 is " +num2);
}
}
