package day20FileAndMultithreading;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo3 {
    public static void main(String[] args) {
        String readFilePath = "/Users/anil/Desktop/filedemo/fnew.txt";
        String writeFilePath = "/Users/anil/Desktop/filedemo/fnew copy.txt";
        try (
                FileInputStream in = new FileInputStream(readFilePath); //reads bitewise
                FileOutputStream out = new FileOutputStream(writeFilePath)) {

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
