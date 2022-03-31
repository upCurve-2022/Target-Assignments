import java.util.*;
class Onlydigits {
	public static boolean onlyDigits(String str)
	{
          int count=0;
		for (int i=0;i<str.length();i++) {
			if (str.charAt(i)>='0'
				&& str.charAt(i)<='9') {
				continue;
			}
			else{
				count++;
			}
		}
           if(count==0)
              return true;
            else
		return false;
	}
	public static void main(String args[])
	{
            Scanner in=new Scanner(System.in);
		String str=in.next();
		System.out.println(onlyDigits(str));
	}
}
