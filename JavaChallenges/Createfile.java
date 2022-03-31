import java.io.File;
import java.io.IOException;

public class Createfile{
    public static void main(String[] args) 
    {
        try {
            File myFile = new File("myFile.txt");
            if(myFile.createNewFile())
            {
                System.out.println("File created");
            }
            else
            {
                System.out.println("File already exists");
            }
        } 
        catch (IOException e)
        {
            System.out.println("Unable to create");
            e.printStackTrace();
        }
    }
}
