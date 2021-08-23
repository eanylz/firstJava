package day20FileAndMultithreading;

import java.io.*;

public class FileDemo5 {
    public static void main(String[] args) {
        String readFilePath = "/Users/anil/Desktop/filedemo/fnew.txt";
        String writeFilePath = "/Users/anil/Desktop/filedemo/fnew copychar3.txt";
        try (
                FileReader fr = new FileReader(readFilePath);
                BufferedReader br = new BufferedReader(fr);
                FileWriter fw = new FileWriter(writeFilePath);
                BufferedWriter bw = new BufferedWriter(fw)) {

            String len;
//            len = in.read();
            while ((len = br.readLine()) != null) {
                System.out.println(len);
                bw.write(len);
                bw.newLine();
                bw.flush();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
