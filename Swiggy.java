import java.util.*;
class DeliveryAvailable extends Exception
{
   public DeliveryAvailable(String str)
    {
      super(str);
     }
}
class validatePincode
{
   void Pincode(String z_code) throws DeliveryAvailable
      {
        if(z_code.length()<6)
            throw new DeliveryAvailable("Invalid pincode"+"\n"+"Please enter valid one");
          else if(z_code.charAt(0)!=5)
                throw new DeliveryAvailable("Delivery unavailable at zip code\n"+z_code);
          else
              throw new DeliveryAvailable("Delivery available at Zip COde\n"+z_code);
       }
}
public class Swiggy
{
  public static void main(String args[])
   {
      validatePincode zip_code=new validatePincode();
      try
       {
          Scanner in=new Scanner(System.in);
            String zipcode=in.next();
             zip_code.Pincode(zipcode);
        }
       catch (DeliveryAvailable ex)
         {
            System.out.println(ex .getMessage());
          }
    }
}