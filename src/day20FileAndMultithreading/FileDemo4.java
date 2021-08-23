package day20FileAndMultithreading;

import java.io.*;

public class FileDemo4 {
    public static void main(String[] args) {
        String readFilePath = "/Users/anil/Desktop/filedemo/fnew.txt";
        String writeFilePath = "/Users/anil/Desktop/filedemo/fnew copychar.txt";
        try (
                FileReader in = new FileReader(readFilePath);  //Reads characterwise
                FileWriter out = new FileWriter(writeFilePath)) {

            int len;
//            len = in.read();
            while ((len = in.read()) != -1) {
                System.out.println(len);
                out.write(len);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
