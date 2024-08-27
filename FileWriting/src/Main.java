import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        File file = new File("wynikiWriting.txt");
        boolean success = file.createNewFile();
        System.out.println(success);

        try(PrintWriter printWriter = new PrintWriter(file))
        {
            printWriter.println("Ala nadal ma kota");
            printWriter.println("Kot nadal ma Alę");
        }
    }
}