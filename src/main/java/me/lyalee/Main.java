package me.lyalee;

public class Main {
    public static void main(String[] args) {

        FileManager.createFile("C:\\Users\\claud\\project\\", "test.txt");
        FileManager.readFile("C:\\Users\\claud\\project\\", "test.txt");
        FileManager.deleteFile("C:\\Users\\claud\\project\\", "test.txt");
    }
}