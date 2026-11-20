package StringsAndOops.FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileWriting {
    public static void main(String[] args)throws Exception{
        File f = new File("src/StringsAndOops/FileHandling/practiceWrite");

        FileWriter fw = new FileWriter(f);
        fw.write("Welcome back to nerchukundama youTube channel");

        fw.close();

        FileReader fr = new FileReader(f);
        int ch;
        while ((ch = fr.read()) != -1){
            System.out.print((char)ch);
        }
        fr.close();
        System.out.println();

        File f1 = new File("src/StringsAndOops/FileHandling/TestFile_1");

        if (f1.createNewFile()) { // already checks whether the file exists.
            System.out.println("File created successfully!");
        } else {
            System.out.println("File already exists!");
        }
    }
}
