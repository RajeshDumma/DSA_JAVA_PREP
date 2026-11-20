package StringsAndOops.FileHandling;

import java.io.*;

public class FileEx {
    public static void main(String[] args){
        File f = new File("Method");
        System.out.println(f.exists());
        if(f.exists()){
            System.out.println("File : " + f.canRead());
            System.out.println("File : " + f.canWrite());
           // f.delete();
        }
    }
}
