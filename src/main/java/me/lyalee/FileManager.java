package me.lyalee;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.SQLOutput;

public class FileManager {
    public static void createFile(String directoryName, String fileName) {
        File file = new File(directoryName + fileName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Could not create file " + fileName);
        }
    }
    public static String readFile(String directoryName, String fileName){
        File file = new File(directoryName + fileName);
        try (BufferedReader br = new BufferedReader(new FileReader(file))){
            StringBuilder fileContent = new StringBuilder();
            String currentLine;
            while ((currentLine = br.readLine()) != null) {
                fileContent.append(currentLine);
                }
            //System.out.println(fileContent);
            return fileContent.toString();
        } catch (IOException e) {
            System.out.println("File does not exist " + fileName);
        }
        return "Unable to read the file";

    }
    public static void deleteFile(String directoryName, String fileName) {
        File file = new File (directoryName + fileName);
        if (file.exists()){
            var deleted = file.delete();
            System.out.println("File deleted : " + fileName);
            System.out.println("But did it work? " + deleted);
        }
        else{
            System.out.println("Could not proceed to delete : " + fileName + file.getAbsolutePath());
        }
    }

    public static void updateFile(String directoryName, String fileName) {

    }
}
