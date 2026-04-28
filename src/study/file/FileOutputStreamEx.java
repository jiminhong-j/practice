package study.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {
    public static void main(String[] args){
        try {
            FileOutputStream fos = new FileOutputStream("output.txt");

            fos.write('A'); // A의 아스키코드는 65
            fos.write(65);
            fos.write('\n');
            System.out.println("AA 저장됨!");

            String str = "Hello World!!!";
            fos.write(str.getBytes());
            System.out.println("문자열 저장됨!");

            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// throw new RuntimeException(e);