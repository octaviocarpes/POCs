package model;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreateTempFile {

    private File temp;

    public CreateTempFile() {
    }

    public void createTempFile(String fileName){

        try {
            File outputfile = new File("src/result-file-directory");
            temp = File.createTempFile(fileName,".tmp",outputfile);
            System.out.println("Temp file: " + temp.getAbsolutePath());
            temp.deleteOnExit();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
