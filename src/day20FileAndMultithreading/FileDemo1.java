package day20FileAndMultithreading;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {
    public static void main(String[] args) {
        String filepath = "/Users/anil/Desktop/filedemo.txt";
        File file = new File(filepath);
        try {
            if(file.createNewFile()){
                System.out.println("file created");
            }else{
                System.out.println("file already exists");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("========");
        filepath = "/Users/anil/Desktop/filedemo";
        File f = new File(filepath);
        f.mkdir();
    }
}
