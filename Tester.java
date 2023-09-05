import java.io.IOException;

public class Tester
{
    public static void main(String [] args) throws IOException
    {
        FileWriter test = new FileWriter();
        System.out.println(test.countCharacters("alphabet.txt"));
    }
}
