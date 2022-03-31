import java.util.*;
import java.io.*;
import java.lang.*;

public class discount 
{
    public static void main(String[] args)
    {
        int cost = 50 , discount=12;
        double discountPrice, finalCost;
        discountPrice= (double)cost * 12/100;
        finalCost=(double)cost-discountPrice;
        System.out.println("Original Price : $ "+cost+"\nDiscount Percentage : "+discount+" %");
        System.out.println(" discount price : $  "+discountPrice + "\nFinal cost : $ "+finalCost);
    }
}
