package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {

    private String fileName;
    private String fileText;
    private BufferedReader reader;

    public FileReader(String fileName) {
        this.fileName = fileName;
        this.fileText = "";
        try {
            reader = new BufferedReader(new java.io.FileReader(new File(fileName)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void readFile(){
        try {
            fileText = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getFileText() {
        return fileText;
    }
}