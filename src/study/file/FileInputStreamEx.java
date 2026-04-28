package study.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx {
    public static void main(String[] args){
        try {
            FileInputStream fis = new FileInputStream("output.txt");

            int one;
            while((one = fis.read()) != -1){
                System.out.print((char)one);
            }
            System.out.println("\n 데이터 로딩 완료!");
            fis.close();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

// throw new RuntimeException(e);