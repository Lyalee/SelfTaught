package me.lyalee;

import java.io.*;

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
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            StringBuilder fileContent;
            while (br.readLine());

        } catch (FileNotFoundException e) {
            System.out.println("File does not exist " + fileName);
        }

    }
}
