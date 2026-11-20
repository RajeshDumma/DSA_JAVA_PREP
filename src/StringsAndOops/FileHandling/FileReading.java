
package StringsAndOops.FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;

public class FileReading {
    public static void main(String[] args) throws Exception {

        File f = new File("src/StringsAndOops/FileHandling/TestFile");

        System.out.println(f.getAbsolutePath());
        System.out.println(f.exists());

        // FileReader reads the file character by character
       /* FileReader fr = new FileReader(f);

        int read;

        while ((read = fr.read()) != -1) {
            System.out.print((char) read);
        }*/

        BufferedReader br = new BufferedReader(new FileReader(f));
        String str;
        while ((str = br.readLine()) != null){
            System.out.println(str);
        }

        br.close();
    }
}
