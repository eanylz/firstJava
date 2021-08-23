package day20FileAndMultithreading;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileDemo2 {
    public static void main(String[] args) {
        String filepath = "/Users/anil/Desktop/filedemo.txt";
        File file = new File(filepath);
        System.out.println(file.getPath());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getName());
        System.out.println(file.getFreeSpace());
        System.out.println(file.getParent());
        System.out.println(file.getName());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.canExecute());
        System.out.println(file.setReadOnly());
        file.setWritable(false);
        System.out.println(file.lastModified());
        System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a").format(file.lastModified()));

        filepath = "/Users/anil/Desktop/file/fnew.txt";
        File f= new File(filepath);
        file.renameTo(f);


    }
}
