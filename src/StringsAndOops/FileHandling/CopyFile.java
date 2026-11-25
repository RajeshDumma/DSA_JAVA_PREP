package StringsAndOops.FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFile {

    public static void main(String[] args) throws Exception {

        // Source file (Read mode)
        FileInputStream fis =
                new FileInputStream("src/StringsAndOops/FileHandling/logo2.jpg");

        // Destination file (Write mode)
        FileOutputStream fos =
                new FileOutputStream("src/StringsAndOops/FileHandling/logo.png");

        int ch;

        // Read and write until the end of file
        while ((ch = fis.read()) != -1) {
            fos.write(ch);
        }

        fos.close();
        fis.close();

        System.out.println("Image copied successfully!");
    }
}