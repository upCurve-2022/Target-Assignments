import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class datetime 
{
    public static void main(String arg[])
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm");
        LocalDateTime current = LocalDateTime.now();
        System.out.println(dtf.format(current));
    }
}
