package StringsAndOops.FileHandling;

import java.io.File;
import java.io.FileOutputStream;

public class CopyFile {
    public static void main(String[] args) throws Exception{
        File f =new File("src/StringsAndOops/FileHandling/TestFile_1");

        FileOutputStream fos = new FileOutputStream(f);
        fos.write((char) 23);
        int b[] = {50,60,70,80};
       // fos.write(b);

    }
}
