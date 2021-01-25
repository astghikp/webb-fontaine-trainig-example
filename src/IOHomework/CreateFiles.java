package IOHomework;

import java.io.FileWriter;
import java.io.IOException;

public class CreateFiles {

    public static void createAndFillFiles()
    {
        try(FileWriter writeFile1 = new FileWriter("resIO/file1.txt")
        )
        {
            writeFile1.write("test file 1 lorem ipsum");
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
        try(FileWriter writeFile2 = new FileWriter("resIO/file2.doc")
        )
        {
            writeFile2.write("Hello test file 2 lorem ipsum");
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
        try(FileWriter writeFile3 = new FileWriter("resIO/file3.txt")
        )
        {
            writeFile3.write("Write Hello test file 3 lorem ipsum");
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
        try(FileWriter writeFile3 = new FileWriter("resIO/file4.jpg")
        )
        {
            writeFile3.write("JPG test file 4 lorem ipsum");
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }
}
