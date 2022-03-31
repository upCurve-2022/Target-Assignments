import java.util.*;
class Removehyphen
{
static String hyphen(String str)
{
   char[] strchar=str.toCharArray();
   String strnew=new String(str);
    strnew="";
   for(int i=0;i<str.length();i++)
     {
        if(strchar[i]=='-'&&strchar[i-1]>='0'&&strchar[i+1]<='9')
           continue;
        else
         {
           strnew+=strchar[i];
            strnew.toString();
         }
      }
   return strnew;
}
static void remove(String str)
{
  String []token=str.split("\\s");
  for(String i:token)
    System.out.print(hyphen(i)+" ");
}
public static void main(String[] args)
{
	Scanner in=new Scanner(System.in);
      String str=in.nextLine();
	remove(str);
}
}
