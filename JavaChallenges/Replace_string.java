import java.util.*;
class Replace_string
{
static String Replacestring(String str)
{
   char[] strchar=str.toCharArray();
   String strnew=new String(str);
    strnew="";
   for(int i=0;i<str.length();i++)
     {
        if(strchar[i]=='a')
           {
             strnew+='$';
             strnew.toString();
            }
        else
         {
           strnew+=strchar[i];
            strnew.toString();
         }
      }
   return strnew;
}
static void replace(String str)
{
  String []token=str.split("\\s");
  for(String i:token)
    System.out.print(Replacestring(i)+" ");
}
public static void main(String[] args)
{
	Scanner in=new Scanner(System.in);
      String str=in.nextLine();
	replace(str);
}
}