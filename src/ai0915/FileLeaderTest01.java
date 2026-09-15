package ai0915;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileLeaderTest01 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("D:/FileIOTest/MyData01.txt"));

            String line = "";

            line = br.readLine();
            System.out.println(line);

            line = br.readLine();
            System.out.println(line);

            line = br.readLine();
            System.out.println(line);

            // FileInputStream 닫기
            br.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
