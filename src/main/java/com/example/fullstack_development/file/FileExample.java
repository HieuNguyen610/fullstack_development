package com.example.fullstack_development.file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileExample {

    public static void main(String[] args) throws IOException {
        String pathName = "test.txt";
        String ouputFile = "output.txt";
        File file = new File("test.txt");
        if(file.isFile()){
            System.out.println("there is file");
        }else{
            System.out.println("Create file: ");
            file.createNewFile();
        }
        try(FileReader fileReader = new FileReader(file);
            FileWriter fileWriter = new FileWriter(ouputFile)){
            int ch;
            while ((ch = fileReader.read()) != -1){
                System.out.println((char) ch);
                fileWriter.write(ch);
            }

            System.out.println((char) ch);
        }
    }
}
