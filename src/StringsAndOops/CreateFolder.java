package StringsAndOops;

import java.io.File;

public class CreateFolder {
    public static void main(String[] args){
        File Folder = new File("WrapperClasses");

        if(Folder.mkdir()){
            System.out.println("Folder created successfully");
        } else{
            System.out.println("Folder already exist ot creation failed");
        }

    }
}
