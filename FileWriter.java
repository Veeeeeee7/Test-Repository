import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileWriter
{

    public int countCharacters (String fileName) throws IOException
    {
        int count = 0;
        BufferedReader reader = new BufferedReader (new FileReader(fileName));
        while (reader.ready())
        {
            count++;
            reader.read();
        }
        reader.close();
        return count;
    }
}