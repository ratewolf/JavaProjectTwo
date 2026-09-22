package ai0922;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterTest02 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("myData2.txt");
            Scanner scanner = new Scanner(System.in);
            String line = "";

            while (true) {
                System.out.print("다음 줄을 입력해주세요(exit로 종료): ");

                line = scanner.nextLine();
                if (line.equals("exit")) {
                    break;
                }

                fw.write(line + "\n");
            }

            fw.close();
            scanner.close();
            System.out.println("myData2.txt에 내용이 저장되었습니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
